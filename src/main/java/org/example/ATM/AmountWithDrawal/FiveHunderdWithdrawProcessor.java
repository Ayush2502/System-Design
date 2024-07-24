package org.example.ATM.AmountWithDrawal;

import org.example.ATM.ATM;

public class FiveHunderdWithdrawProcessor extends CashWithDrawalProcessor{

    public FiveHunderdWithdrawProcessor(CashWithDrawalProcessor cashWithdrawalProcessor) {
        super(cashWithdrawalProcessor);
    }
    public void withdraw(ATM atm, int remainingAmount){

        int required =  remainingAmount/500;
        int balance = remainingAmount%500;

        if(required <= atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(required);
        }
        else if(required > atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(atm.getNoOfFiveHundredNotes());
            balance = balance + (required-atm.getNoOfFiveHundredNotes()) * 500;
        }

        if(balance != 0){
            super.withdraw(atm, balance);
        }
    }

}
