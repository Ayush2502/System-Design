package org.example.ChainOfResponsibilty;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static  int ERROR = 3;

    // the parent is keeping a variable who will help it to tell who is the next handler
    LogProcessor nextLogProcessor;

    // when one fails , the parent can call the next handler through this constructor
    LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int level,String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.log(level,message);
        }
    }

}
