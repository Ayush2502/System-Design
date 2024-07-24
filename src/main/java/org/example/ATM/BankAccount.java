package org.example.ATM;

public class BankAccount {

    String accNumber;
    int accBal;

    public BankAccount() {

    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public int getAccBal() {
        return accBal;
    }

    public void setAccBal(int accBal) {
        this.accBal = accBal;
    }

    public BankAccount(String accNumber, int accBal) {
        this.accNumber = accNumber;
        this.accBal = accBal;
    }
    public void deductAmount(int amount){
        accBal = accBal-amount;
        setAccBal(accBal);
    }
}
