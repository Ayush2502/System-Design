package org.example.CommandDesignPattern;

public class Invoker {
    ICommand command;
    Invoker(){}

    public void setCommand(ICommand command){
        this.command = command;
    }
    public void pressButton(){
        command.Execute();
    }
}
