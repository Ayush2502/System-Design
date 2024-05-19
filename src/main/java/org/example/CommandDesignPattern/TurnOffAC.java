package org.example.CommandDesignPattern;

/*
This is a command class which has commands on what has to be performed. It gets is instruction from Invoker class who is responsible for giving the commands.
 */

public class TurnOffAC implements ICommand {
    AirConditioner ac;
    public TurnOffAC(AirConditioner ac){
        this.ac = ac;
    }
    @Override
    public void Execute() {
        ac.turnOffAC();
    }
}