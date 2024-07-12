package org.example.StateDesignPattern_VendingMachine.Impl;

import org.example.StateDesignPattern_VendingMachine.Coins;
import org.example.StateDesignPattern_VendingMachine.Item;
import org.example.StateDesignPattern_VendingMachine.State;
import org.example.StateDesignPattern_VendingMachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {
    public IdleState() {
    }

    public IdleState(VendingMachine vendingMachine) {
        System.out.println("IDLE STATE");
        vendingMachine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoins(VendingMachine vendingMachine, Coins coins) throws Exception {
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        System.out.println("IDLE STATE");
        vendingMachine.setCoinList(new ArrayList<>());
    }

    @Override
    public void selectProducts(VendingMachine vendingMachine, int itemNumber) throws Exception {

    }

    @Override
    public void getChange(int getChangedAmount) throws Exception {

    }

    @Override
    public List<Coins> getFullRefund(VendingMachine vendingMachine) throws Exception {
        return null;
    }

    @Override
    public Item DispenseProduct(VendingMachine vendingMachine, int itemNumber) throws Exception {
        return null;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int itemNumber) throws Exception {

    }
}