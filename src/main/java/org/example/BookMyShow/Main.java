package org.example.BookMyShow;

import org.example.BookMyShow.Booking.Booking;
import org.example.BookMyShow.Enums.City;
import org.example.BookMyShow.Enums.SeatCategory;
import org.example.BookMyShow.Movie.Movie;
import org.example.BookMyShow.MovieController.MovieController;
import org.example.BookMyShow.Screen.Screen;
import org.example.BookMyShow.Seat.Seat;
import org.example.BookMyShow.Show.Show;
import org.example.BookMyShow.Theatre.Theatre;
import org.example.BookMyShow.TheatreController.TheatreController;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    MovieController movieController;
    TheatreController theatreController;

    Main() {
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    public static void main(String args[]) {
        Main bookMyShow = new Main();

        bookMyShow.initialize();

        //user1
        bookMyShow.createBooking(City.BANGALORE, "BAAHUBALI");
        //user2
        bookMyShow.createBooking(City.BANGALORE, "BAAHUBALI");


    }

    private void initialize() {
        //create movies
        createMovies();
        //create theater with screens, seats and shows
        createTheatre();
    }

    private void createMovies() {

        //create Movies1
        Movie avengers = new Movie();
        avengers.setMovieId(String.valueOf(1));
        avengers.setName("AVENGERS");
        avengers.setDuration(128);

        //create Movies2
        Movie baahubali = new Movie();
        baahubali.setMovieId(String.valueOf(2));
        baahubali.setName("BAAHUBALI");
        baahubali.setDuration(180);


        //add movies against the cities
        movieController.addMovie(avengers, City.BANGALORE);
        movieController.addMovie(avengers, City.DELHI);
        movieController.addMovie(baahubali, City.BANGALORE);
        movieController.addMovie(baahubali, City.DELHI);
    }

    private void createTheatre() {

        Movie avengerMovie = movieController.getMovieByName("AVENGERS");
        Movie baahubali = movieController.getMovieByName("BAAHUBALI");

        Theatre inoxTheatre = new Theatre();
        inoxTheatre.setTheatreId(String.valueOf(1));
        inoxTheatre.setScreenList(createScreen());
        inoxTheatre.setCity(City.BANGALORE);
        List<Show> inoxShows = new ArrayList<>();
        Show inoxMorningShow = createShows(1, inoxTheatre.getScreenList().get(0), avengerMovie, 8);
        Show inoxEveningShow = createShows(2, inoxTheatre.getScreenList().get(0), baahubali, 16);
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheatre.setShowList(inoxShows);


        Theatre pvrTheatre = new Theatre();
        pvrTheatre.setTheatreId(String.valueOf(2));
        pvrTheatre.setScreenList(createScreen());
        pvrTheatre.setCity(City.DELHI);
        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow = createShows(3, pvrTheatre.getScreenList().get(0), avengerMovie, 13);
        Show pvrEveningShow = createShows(4, pvrTheatre.getScreenList().get(0), baahubali, 20);
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvrTheatre.setShowList(pvrShows);

        theatreController.addTheatre(inoxTheatre, City.BANGALORE);
        theatreController.addTheatre(pvrTheatre, City.DELHI);

    }

    private List<Screen> createScreen() {

        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setId(1);
        screen1.setSeatList(createSeats());
        screens.add(screen1);
        return screens;
    }

    private Show createShows(int showId, Screen screen, Movie movie, int showStartTime) {

        Show show = new Show();
        show.setId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setStartTime(String.valueOf(showStartTime)); //24 hrs time ex: 14 means 2pm and 8 means 8AM
        return show;
    }

    private List<Seat> createSeats() {

        //creating 100 seats for testing purpose, this can be generalised
        List<Seat> seats = new ArrayList<>();

        //1 to 40 : SILVER
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

        //41 to 70 : SILVER
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        //1 to 40 : SILVER
        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;
    }

    private void createBooking(City userCity, String movieName) {
        //1. search movie by my location
        List<Movie> movies = movieController.getMoviesByCity(userCity);

        //2. select the movie which you want to see. i want to see Baahubali
        Movie interestedMovie = null;
        for (Movie movie : movies) {

            if ((movie.getName()).equals(movieName)) {
                interestedMovie = movie;
            }
        }

        //3. get all show of this movie in Bangalore location
        Map<Theatre, List<Show>> showsTheatreWise = theatreController.getAllShow(interestedMovie, userCity);

        //4. select the particular show user is interested in
        Map.Entry<Theatre, List<Show>> entry = showsTheatreWise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        //5. select the seat
        int seatNumber = 30;
        List<Integer> bookedSeats = interestedShow.getBookedSeats();
        if (!bookedSeats.contains(seatNumber)) {
            bookedSeats.add(seatNumber);
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();
            for (Seat screenSeat : interestedShow.getScreen().getSeatList()) {
                if (screenSeat.getId() == seatNumber) {
                    myBookedSeats.add(screenSeat);
                }
                booking.setBookedSeats(myBookedSeats);
                booking.setShow(interestedShow);
            }
        } else {
            //throw exception
            System.out.println("seat already booked, try again");
            return;
        }

        System.out.println("BOOKING SUCCESSFUL");
    }
}

