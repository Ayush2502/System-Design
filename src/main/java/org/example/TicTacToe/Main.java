package org.example.TicTacToe;

public class Main {
    public static void main(String args[]){
        TicTacToe toe = new TicTacToe();
        toe.InitialiseGame();
        System.out.println("The winner of the game is"+toe.StartGame());
    }
}
