package org.example.BuilderDesignPattern.NullObjectPattern;

public class Car implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 400;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}
