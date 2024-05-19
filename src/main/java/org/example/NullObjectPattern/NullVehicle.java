package org.example.NullObjectPattern;

public class NullVehicle implements Vehicle{

    String typeOfVehicle;
    public NullVehicle(String typeOfVehicle){
    this.typeOfVehicle = typeOfVehicle;
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
}
