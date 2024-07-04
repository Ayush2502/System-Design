package org.example.StateDesignPattern_VendingMachine;

public enum Coins {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);
    public int value;
    Coins(int value){
        this.value = value;
    }
}
