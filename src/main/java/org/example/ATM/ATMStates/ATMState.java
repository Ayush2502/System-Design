package org.example.ATM.ATMStates;

import org.example.ATM.ATM;
import org.example.ATM.Card;
import org.example.ATM.TransactionType;

public interface ATMState {

    public void inserCard(Card card, ATM atm);
    public void authenticatePin(ATM atm, Card card, String pin);
    public void selectOperations(ATM atm, Card card, TransactionType transactionType);
    public void cashWithdrawal(ATM atm, Card card, int amount);
    public void displayBalance(ATM atm, Card card);
    public void returnCard();
    public void Exit(ATM atm);

}
