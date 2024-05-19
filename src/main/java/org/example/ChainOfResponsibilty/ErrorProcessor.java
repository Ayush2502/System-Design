package org.example.ChainOfResponsibilty;

public class ErrorProcessor extends LogProcessor{
    ErrorProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int level,String message){
        if(level ==ERROR){
            System.out.println(level+" ->"+ message);
        }
        else{
            super.log(level,message);
        }
    }
}
