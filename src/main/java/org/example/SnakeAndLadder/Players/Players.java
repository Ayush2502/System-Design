package org.example.SnakeAndLadder.Players;

public class Players {
    String id;
   public  int  currPosition;

    public Players(int id, int currPosition) {
        this.id = String.valueOf(id);
        this.currPosition = currPosition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCurrPosition() {
        return currPosition;
    }

    public void setCurrPosition(int currPosition) {
        this.currPosition = currPosition;
    }
}
