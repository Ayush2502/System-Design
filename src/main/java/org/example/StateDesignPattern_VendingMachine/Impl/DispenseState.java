package org.example.StateDesignPattern_VendingMachine.Impl;

import org.example.StateDesignPattern_VendingMachine.*;

import java.util.ArrayList;
import java.util.List;

public class DispenseState implements State {
    public DispenseState(VendingMachine vendingMachine,int itemNumber) throws Exception{
        DispenseProduct(vendingMachine,itemNumber);
    }

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
        return;
    }

    @Override
    public void getChange(int getChangedAmount) throws Exception {
        return;
    }

    @Override
    public List<Coins> getFullRefund(VendingMachine vendingMachine) throws Exception {
        return null;
    }

    @Override
    public Item DispenseProduct(VendingMachine vendingMachine, int itemNumber) throws Exception {
        Item item = vendingMachine.getInventory().getItem(itemNumber);
        updateInventory(vendingMachine,item,itemNumber);
        vendingMachine.getInventory().updateSoldOutItem(itemNumber);
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return item;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int itemNumber) throws Exception {
        return;
    }

}