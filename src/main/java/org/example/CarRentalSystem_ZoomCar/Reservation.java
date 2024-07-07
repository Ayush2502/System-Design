package org.example.CarRentalSystem_ZoomCar;

import org.example.CarRentalSystem_ZoomCar.Enums.ReservationStatus;
import org.example.CarRentalSystem_ZoomCar.Product.Vehicle;
import java.util.Date;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingStartDate;
    Date bookingEndDate;
    Location pickUpLocation;
    Location dropLocation;
    ReservationStatus status;
    Location location;
    ReservationStatus reservationStatus;


    public Reservation(int reservationId, User user, Vehicle vehicle, Date bookingStartDate, Date bookingEndDate, Location pickUpLocation, Location dropLocation,
                       ReservationStatus status, Location location, ReservationStatus reservationStatus) {
        this.reservationId = reservationId;
        this.user = user;
        this.vehicle = vehicle;
        this.bookingStartDate = bookingStartDate;
        this.bookingEndDate = bookingEndDate;
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.status = status;
        this.location = location;
        this.reservationStatus = reservationStatus;
    }

    public Reservation() {
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getBookingStartDate() {
        return bookingStartDate;
    }

    public void setBookingStartDate(Date bookingStartDate) {
        this.bookingStartDate = bookingStartDate;
    }

    public Date getBookingEndDate() {
        return bookingEndDate;
    }

    public void setBookingEndDate(Date bookingEndDate) {
        this.bookingEndDate = bookingEndDate;
    }

    public Location getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(Location pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public int createReserve(User user, Vehicle vehicle){

        //generate new id
        reservationId = 12232;
        this.user=user;
        this.vehicle=vehicle;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }




}
