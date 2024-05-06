package org.example.Liskov;

public class Bicycle extends Vehicle {

    @Override
    public Integer getNumberOfWheels(){
        return 2;
    }
    @Override
    public Boolean hasEngine(){
        return null;
    }
}
