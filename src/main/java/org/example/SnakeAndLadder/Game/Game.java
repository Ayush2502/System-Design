package org.example.SnakeAndLadder.Game;

import org.example.SnakeAndLadder.Board.Board;
import org.example.SnakeAndLadder.Cells.Cells;
import org.example.SnakeAndLadder.Dice.Dice;
import org.example.SnakeAndLadder.Players.Players;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board gameBoard;
    Players winner;
    Dice dice;
    Deque<Players> playersDeque;


    public Game() {
    initialiseGame();
    }

    public void initialiseGame(){
        gameBoard = new Board(10,5,5);
        dice = new Dice(1);
        addPlayers();
        winner = null;
    }
    public void addPlayers(){
        Players player1 = new Players(1,0);
        Players player2 = new Players(1,0);
        playersDeque = new LinkedList<>();
        playersDeque.add(player1);
        playersDeque.add(player2);
    }
    public void startGame(){
        while(winner == null){
            //check whose turn is now.
            Players currentPlayer = playersDeque.removeFirst();
            System.out.println("Player with player id:"+currentPlayer.getId()+" has a turn.");
            // roll the dice
            int diceNumber = dice.rollDice();
            int playerNewPosition = currentPlayer.getCurrPosition()+diceNumber;
            playerNewPosition = JumpCheck(playerNewPosition);
            currentPlayer.currPosition = playerNewPosition;
            playersDeque.addLast(currentPlayer);
            if(playerNewPosition>= gameBoard.board.length * gameBoard.board.length-1){
                winner = currentPlayer;
            }
        }
    }
    private int JumpCheck(int playerPosition){
        if(playerPosition > gameBoard.board.length * gameBoard.board.length-1 ){
            return playerPosition;
        }
        Cells cells = gameBoard.getCell(playerPosition);
        if(cells.jump!=null && cells.jump.startIdx == playerPosition){
            String jumpBy = (cells.jump.startIdx < cells.jump.endIdx)? "Ladder": "Snake";
            System.out.println("Jump is Done by"+jumpBy);
            return cells.jump.endIdx;
        }
        return playerPosition;
    }
}
