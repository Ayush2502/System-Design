package org.example.StateDesignPattern_VendingMachine.Impl;

import org.example.StateDesignPattern_VendingMachine.Coins;
import org.example.StateDesignPattern_VendingMachine.Item;
import org.example.StateDesignPattern_VendingMachine.State;
import org.example.StateDesignPattern_VendingMachine.VendingMachine;

import java.util.List;

public class SelectionState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoins(VendingMachine vendingMachine, Coins coins) throws Exception {
        return;
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void selectProducts(VendingMachine vendingMachine, int itemNumber) throws Exception {
    Item item = vendingMachine.getInventory().getItem(itemNumber);

        int paidByUser = 0;
        for(Coins coin : vendingMachine.getCoinList()){
            paidByUser = paidByUser + coin.value;
        }

        //3. compare product price and amount paid by user
        if(paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
            getFullRefund(vendingMachine);
            throw new Exception("insufficient amount");
        }
        else if(paidByUser >= item.getPrice()) {

            if(paidByUser > item.getPrice()) {
                getChange(paidByUser-item.getPrice());
            }
            vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, itemNumber));
        }

    }

    @Override
    public void getChange(int getChangedAmount) throws Exception {
        System.out.println("Refunding Extra Amount:"+getChangedAmount);
        return;
    }

    @Override
    public List<Coins> getFullRefund(VendingMachine vendingMachine) throws Exception {
        System.out.println("Insufficient Amount");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();
    }

    @Override
    public Item DispenseProduct(VendingMachine vendingMachine, int itemNumber) throws Exception {
        return null;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int itemNumber) throws Exception {

    }

}