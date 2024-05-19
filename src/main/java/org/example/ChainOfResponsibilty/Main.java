package org.example.ChainOfResponsibilty;

public class Main {
    public static void main(String args[]){
        LogProcessor logger = new InfoProcessor(new DebugProcessor(new ErrorProcessor(null)));

        logger.log(1,"I am here");
        logger.log(2,"I am at Debug");
        logger.log(3,"Exception Occured");
    }
}
