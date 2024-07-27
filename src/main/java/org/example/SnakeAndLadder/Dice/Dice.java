package org.example.SnakeAndLadder.Dice;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min = 1;
    int max =6;


    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int getDiceCount() {
        return diceCount;
    }

    public void setDiceCount(int diceCount) {
        this.diceCount = diceCount;
    }
    public int rollDice(){
        int value  = ThreadLocalRandom.current().nextInt(min,max);
        return value;
    }
}
