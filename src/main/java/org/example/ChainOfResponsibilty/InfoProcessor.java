package org.example.ChainOfResponsibilty;

public class InfoProcessor extends LogProcessor{
    InfoProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int level,String message){
        if(level ==INFO){
            System.out.println(level+" ->"+ message);
        }
        else{
            super.log(level,message);
        }
    }
}
