package org.example.ATM.ATMStates;

import org.example.ATM.ATM;
import org.example.ATM.Card;
import org.example.ATM.TransactionType;

public class HasCardState implements ATMState{
    public HasCardState() {
        System.out.println("Enter the Pin ");
    }

    @Override
    public void inserCard(Card card, ATM atm) {

    }

    @Override
    public void authenticatePin(ATM atm, Card card, String pin) {
        if(card.validatePin(pin)){
            atm.setAtmCurrentState(new SelectOptionState());
        }else {
            System.out.println("Please Enter Correct Pin, 2 more chances remaining");
            Exit(atm);
        }

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
        System.out.println("Please collect your card");
    }

    @Override
    public void Exit(ATM atm) {
        returnCard();
        atm.setAtmCurrentState(new IdleState());
        System.out.println("Exit happens");
    }
}
