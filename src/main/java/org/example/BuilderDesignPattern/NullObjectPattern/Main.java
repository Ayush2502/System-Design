package org.example.BuilderDesignPattern.NullObjectPattern;

public class Main {

    public static void main(String args[]){

            Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
            printVehicleDeatails(vehicle);

    }
    public static void printVehicleDeatails(Vehicle vehicle){
        System.out.println("Seating capacity ="+vehicle.getSeatingCapacity());
        System.out.println("Tank capacity ="+vehicle.getTankCapacity());
    }
}
