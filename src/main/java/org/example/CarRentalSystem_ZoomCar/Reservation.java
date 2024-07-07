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



}
