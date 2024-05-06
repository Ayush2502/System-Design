package org.example;

import org.example.Liskov.Bicycle;
import org.example.Liskov.Car;
import org.example.Liskov.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {

        List<Vehicle> list = new ArrayList<>();
        list.add(new Bicycle());
        list.add(new Car());
        for(Vehicle vehicle: list){
            System.out.println(vehicle.hasEngine().toString());
        }
    }
}