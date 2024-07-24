package org.example.ATM.AmountWithDrawal;

import org.example.ATM.ATM;

public class OneHundredWithDrawProcessor extends CashWithDrawalProcessor{

    public OneHundredWithDrawProcessor(CashWithDrawalProcessor cashWithdrawalProcessor) {
        super(cashWithdrawalProcessor);
    }
    public void withdraw(ATM atm, int remainingAmount){

        int required =  remainingAmount/500;
        int balance = remainingAmount%500;

        if(required <= atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(required);
        }
        else if(required > atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(atm.getNoOfOneHundredNotes());
            balance = balance + (required-atm.getNoOfOneHundredNotes()) * 500;
        }

        if(balance != 0){
            super.withdraw(atm, balance);
        }
    }

}
