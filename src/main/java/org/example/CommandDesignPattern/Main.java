package org.example.CommandDesignPattern;

public class Main {
    public static void main(String[]args){

        AirConditioner ac = new AirConditioner();

        Invoker invoker = new Invoker();

        invoker.setCommand(new TurnOnAC(ac));
        invoker.pressButton();
    }
}
