package org.example.BookMyShow.Movie;

import org.example.BookMyShow.Enums.Genre;

public class Movie{
    String movieId;
    String name;
    int duration;
    Genre genre;

    public Movie(String movieId, String name, int duration, Genre genre) {
        this.movieId = movieId;
        this.name = name;
        this.duration = duration;
        this.genre = genre;
    }

    public Movie() {

    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
