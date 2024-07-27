package org.example.SnakeAndLadder.Board;

import org.example.SnakeAndLadder.Cells.Cells;
import org.example.SnakeAndLadder.Jump.Jump;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    public Cells[][] board;


    public Board(int boardSize, int numberOfSnaker, int numberOfLadders){
        initialiseCells(boardSize);
    }
    public void initialiseCells(int boardSize){
        board = new Cells[boardSize][boardSize];

        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                Cells cells  = new Cells();
                board[i][j] = cells;
            }
        }
    }
    public void setSnakesAndladders(Cells[][] cells,int numberOfSnakes,int numberOfLadders){

        while(numberOfSnakes>0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            if(snakeHead>snakeTail){
                Jump jump = new Jump();
                jump.startIdx = snakeHead;
                jump.endIdx = snakeTail;
                Cells cell = getCell(snakeHead);
                cell.jump = jump;
                numberOfSnakes--;
            }
        }
        while(numberOfLadders-->0){
            int ladderHead = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            if(ladderTail>ladderHead){
                Jump jump1 = new Jump();
                jump1.startIdx = ladderHead;
                jump1.endIdx = ladderTail;
                Cells cell = getCell(ladderHead);
                cell.jump = jump1;
            }
        }
    }
    public Cells getCell(int position){
        int boardRow = position/board.length;
        int boardCol = position%board.length;
        return board[boardRow][boardCol];
    }
}
