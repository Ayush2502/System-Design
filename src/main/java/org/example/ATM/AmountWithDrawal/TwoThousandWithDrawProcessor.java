package org.example.ATM.AmountWithDrawal;

import org.example.ATM.ATM;

public class TwoThousandWithDrawProcessor extends CashWithDrawalProcessor{

    public TwoThousandWithDrawProcessor(CashWithDrawalProcessor cashWithdrawalProcessor) {
        super(cashWithdrawalProcessor);
    }
    public void withdraw(ATM atm, int remainingAmount) {

        int required =  remainingAmount/2000;
        int balance = remainingAmount%2000;

        if(required <= atm.getNoOfTwoThousandNotes()) {
            atm.deductTwoThousandNotes(required);
        }
        else if(required > atm.getNoOfTwoThousandNotes()) {
            atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNotes());
            balance = balance + (required-atm.getNoOfTwoThousandNotes()) * 2000;
        }
        if(balance != 0){
            super.withdraw(atm, balance);
        }
    }

}
