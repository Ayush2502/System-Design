package org.example.TicTacToe;

import org.example.TicTacToe.Board.Board;
import org.example.TicTacToe.Board.Pair;
import org.example.TicTacToe.Player.Player;
import org.example.TicTacToe.PlayingPiece.PieceType;
import org.example.TicTacToe.PlayingPiece.PlayingPieceO;
import org.example.TicTacToe.PlayingPiece.PlayingPieceX;
import java.util.*;

public class TicTacToe {
    Deque<Player> playerDeque;
    Board board;

    public TicTacToe() {
        InitialiseGame();
    }
    public void InitialiseGame(){
        playerDeque = new LinkedList<>();
        Player player1 = new Player("Golu", new PlayingPieceX());
        Player player2 = new Player("Babu",new PlayingPieceO());
        playerDeque.add(player1);
        playerDeque.add(player2);
        board = new Board(3);
    }
    public String StartGame(){
    boolean noWinner = true;
    while(noWinner){
       Player player = playerDeque.removeFirst();
       board.printBoard();
       List<List<Pair>> freeCells = Collections.singletonList(board.getFreeCells());
       if(freeCells.isEmpty()) {
           return "tie";
        }
    System.out.println("Player:" + player + " Enter row,column: ");
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String arr[] = s.split(",");
       int row = Integer.parseInt(arr[0]);
       int col = Integer.parseInt(arr[1]);
       boolean pieceAdded = board.addPiece(row,col,player.getPlayingPiece());
       if(!pieceAdded){
           System.out.println("Added in Wrong Position,Try Again!!!!");
           playerDeque.addFirst(player);
           continue;
       }
       playerDeque.addLast(player);

       boolean Winner =isThereWinner(row,col,player.getPlayingPiece().pieceType);
       if(Winner){
           return player.getName();
       }
    }
    return "tie";
    }
    public boolean isThereWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<board.size;i++) {

            if(board.board[row][i] == null || board.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<board.size;i++) {
            if(board.board[i][column] == null || board.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<board.size;i++,j++) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=board.size-1; i<board.size;i++,j--) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
