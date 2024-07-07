package org.example.CarRentalSystem_ZoomCar;

import org.example.CarRentalSystem_ZoomCar.Enums.VehicleType;
import org.example.CarRentalSystem_ZoomCar.Product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Store {
    Location storeLocation;
    int storeId;
    VehicleInventoryManager vehicleInventoryManager;
    List<Reservation> reservations = new ArrayList<>();

    public Store(Location storeLocation, int storeId, VehicleInventoryManager vehicleInventoryManager,
                 List<Reservation> reservations) {
        this.storeLocation = storeLocation;
        this.storeId = storeId;
        this.vehicleInventoryManager = vehicleInventoryManager;
        this.reservations = reservations;
    }

    public Store() {
    }

    public Location getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(Location storeLocation) {
        this.storeLocation = storeLocation;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public VehicleInventoryManager getVehicleInventoryManager() {
        return vehicleInventoryManager;
    }

    public void setVehicleInventoryManager(VehicleInventoryManager vehicleInventoryManager) {
        this.vehicleInventoryManager = vehicleInventoryManager;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    List<Vehicle> getVehicles(VehicleType vehicleType){
        return vehicleInventoryManager.getVehicles();
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }
    public void setVehicles(List<Vehicle> vehicles) {
        vehicleInventoryManager = new VehicleInventoryManager(vehicles);
    }
    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        return true;
    }



}
