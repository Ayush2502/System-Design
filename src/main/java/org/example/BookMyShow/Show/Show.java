package org.example.BookMyShow.Show;

import org.example.BookMyShow.Movie.Movie;
import org.example.BookMyShow.Screen.Screen;
import org.example.BookMyShow.Seat.Seat;
import java.util.List;

public class Show {
    int id;
    Movie movie;
    Screen screen;
    String startTime;
    List<Seat> bookedSeats;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public List<Integer> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}
