package org.example.ATM.ATMStates;

import org.example.ATM.ATM;
import org.example.ATM.Card;
import org.example.ATM.TransactionType;

public class IdleState implements ATMState{
    @Override
    public void inserCard(Card card, ATM atm) {
        System.out.println("Card is Inserted");
        atm.setAtmCurrentState(new HasCardState());
    }

    @Override
    public void authenticatePin(ATM atm, Card card, String pin) {

    }

    @Override
    public void selectOperations(ATM atm, Card card, TransactionType transactionType) {

    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int amount) {

    }

    @Override
    public void displayBalance(ATM atm, Card card) {

    }

    @Override
    public void returnCard() {

    }

    @Override
    public void Exit(ATM atm) {

    }
}
