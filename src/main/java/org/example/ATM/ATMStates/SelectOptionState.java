package org.example.ATM.ATMStates;

import org.example.ATM.ATM;
import org.example.ATM.Card;
import org.example.ATM.TransactionType;

public class SelectOptionState implements ATMState {
    public SelectOptionState() {
        System.out.println("Select the transaction ");
    }

    @Override
    public void inserCard(Card card, ATM atm) {

    }

    @Override
    public void authenticatePin(ATM atm, Card card, String pin) {

    }

    @Override
    public void selectOperations(ATM atm, Card card, TransactionType transactionType) {
        switch(transactionType) {
            case CASH_WITHDRAWAL:
                atm.setAtmCurrentState(new CashWithdrawalState());
                break;
            case CHECK_BALANCE:
                atm.setAtmCurrentState(new DisplayBalanceState());
                break;
            default: {
                System.out.println("Invalid Option");
                Exit(atm);
            }
        }
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card,int  amount) {

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
