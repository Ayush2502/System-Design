package org.example.ATM.ATMStates;

import org.example.ATM.ATM;
import org.example.ATM.AmountWithDrawal.CashWithDrawalProcessor;
import org.example.ATM.AmountWithDrawal.FiveHunderdWithdrawProcessor;
import org.example.ATM.AmountWithDrawal.OneHundredWithDrawProcessor;
import org.example.ATM.AmountWithDrawal.TwoThousandWithDrawProcessor;
import org.example.ATM.Card;
import org.example.ATM.TransactionType;

public class CashWithdrawalState implements ATMState {
    public CashWithdrawalState() {
        System.out.println("Enter the Amount you want to withdraw");
    }

    @Override
    public void inserCard(Card card, ATM atm) {

    }

    @Override
    public void authenticatePin(ATM atm, Card card, String pin) {

    }

    @Override
    public void selectOperations(ATM atm, Card card, TransactionType transactionType) {

    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int amount) {

        if (atm.getAtmBalance() < amount) {
            System.out.println("Insufficient fund in the ATM Machine");
            Exit(atm);
        } else if (card.getBankAccount().getAccBal() < amount) {
            System.out.println("Insufficient fund in the your Bank Account");
            Exit(atm);
        } else {
            card.getBankAccount().deductAmount(amount);
            atm.deductATMBalance(amount);

            CashWithDrawalProcessor cashWithDrawalProcessor = new TwoThousandWithDrawProcessor(new FiveHunderdWithdrawProcessor(new OneHundredWithDrawProcessor(null)));
            cashWithDrawalProcessor.withdraw(atm, amount);
            Exit(atm);
        }
    }

    @Override
    public void displayBalance(ATM atm, Card card) {

    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

    @Override
    public void Exit(ATM atm) {
        returnCard();
        atm.setAtmCurrentState(new IdleState());
        System.out.println("Exit happens");
    }
}
