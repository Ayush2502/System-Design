package org.example.CarRentalSystem_ZoomCar;

import org.example.CarRentalSystem_ZoomCar.Product.Vehicle;

import java.util.List;

public class VehicleInventoryManager {
    List<Vehicle> vehicles;

    VehicleInventoryManager(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        //filtering
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

}
