package org.example.CarRentalSystem_ZoomCar;

import org.example.CarRentalSystem_ZoomCar.Product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Store {
    Location storeLocation;
    int storeId;
    VehicleInventoryManager vehicleInventoryManager;
    List<Reservation> reservations = new ArrayList<>();

}
