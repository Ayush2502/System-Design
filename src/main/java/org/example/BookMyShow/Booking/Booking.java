package org.example.BookMyShow.Booking;

import org.example.BookMyShow.Payment.Payment;
import org.example.BookMyShow.Seat.Seat;
import org.example.BookMyShow.Show.Show;

import java.util.ArrayList;
import java.util.List;

public class Booking {

    Show show;
    List<Seat> bookedSeats = new ArrayList<>();
    Payment payment;

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
