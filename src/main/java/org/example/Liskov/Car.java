package org.example.Liskov;

public class Car extends Vehicle {
    @Override
    public Integer getNumberOfWheels(){
        return 4;
    }
    @Override
    public Boolean hasEngine(){
        return true;
    }
}
