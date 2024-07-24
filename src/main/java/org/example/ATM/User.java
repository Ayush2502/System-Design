package org.example.ATM;

public class User {
    Card atmCard;
    BankAccount bankAccount;

    public User() {

    }

    public Card getAtmCard() {
        return atmCard;
    }

    public void setAtmCard(Card atmCard) {
        this.atmCard = atmCard;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public User(Card atmCard, BankAccount bankAccount) {
        this.atmCard = atmCard;
        this.bankAccount = bankAccount;
    }
}
