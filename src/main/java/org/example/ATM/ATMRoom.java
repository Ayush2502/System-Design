package org.example.ATM;

public class ATMRoom {
    ATM atm;
    User user;

    public static void main(String args[]){
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialise();

        atmRoom.atm.printCurrentATMStatus();
        atmRoom.atm.getAtmCurrentState().inserCard(atmRoom.user.atmCard,atmRoom.atm);
        atmRoom.atm.getAtmCurrentState().authenticatePin(atmRoom.atm,atmRoom.user.atmCard,"1221");
        atmRoom.atm.getAtmCurrentState().selectOperations(atmRoom.atm,atmRoom.user.atmCard,TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getAtmCurrentState().cashWithdrawal(atmRoom.atm,atmRoom.user.atmCard,2000);
        atmRoom.atm.printCurrentATMStatus();

    }
    private void initialise(){
        //create ATM
        atm = ATM.getATMObject();
        atm.setAtmBalance(3000,1,2,5);
        user = CreateUser();
    }
    private User CreateUser(){
        User user = new User();
        user.setBankAccount(CreateBankAccount());
        user.setAtmCard(CreateCard());
        return user;
    }
    private Card CreateCard(){
        Card card = new Card();
        BankAccount bankAccount = CreateBankAccount();
        card.setBankAccount(bankAccount);
        return card;
    }
    private BankAccount CreateBankAccount(){
        BankAccount bankAccount = new BankAccount("12345678922",34000);
        return bankAccount;
    }


}
