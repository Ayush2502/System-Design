package org.example.BookMyShow.Screen;

import org.example.BookMyShow.Seat.Seat;

import java.util.List;

public class Screen {
    int id;
    List<Seat> seatList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}
