package org.example.ATM.AmountWithDrawal;

import org.example.ATM.ATM;

public class CashWithDrawalProcessor {
    CashWithDrawalProcessor cashWithDrawalProcessor;

    CashWithDrawalProcessor(CashWithDrawalProcessor cashWithdrawalProcessor) {
        this.cashWithDrawalProcessor = cashWithdrawalProcessor;
    }

    public void withdraw(ATM atm, int remainingAmount) {

        if (cashWithDrawalProcessor != null) {
            cashWithDrawalProcessor.withdraw(atm, remainingAmount);
        }
    }

}
