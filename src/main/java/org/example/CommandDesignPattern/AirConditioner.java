package org.example.CommandDesignPattern;

/*
It is a receiver class on which the commands has to be perfomed.
 */
public class AirConditioner {
    boolean isAcOn;
    double temperature;

    public void turnOnAC(){
        isAcOn = true;
        System.out.println("AC is on");
    }
    public void turnOffAC(){
        isAcOn = false;
        System.out.println("AC is Off");
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
        System.out.println("Temperature changed to:"+ temperature);
    }
}
