package org.example.ChainOfResponsibilty;

public class DebugProcessor extends LogProcessor{
    DebugProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int level,String message){
        if(level ==DEBUG){
            System.out.println(level+" ->"+ message);
        }
        else{
            super.log(level,message);
        }
    }
}
