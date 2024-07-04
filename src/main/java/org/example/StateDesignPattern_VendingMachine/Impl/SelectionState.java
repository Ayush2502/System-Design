package org.example.StateDesignPattern_VendingMachine.Impl;

import org.example.StateDesignPattern_VendingMachine.Coins;
import org.example.StateDesignPattern_VendingMachine.Item;
import org.example.StateDesignPattern_VendingMachine.State;
import org.example.StateDesignPattern_VendingMachine.VendingMachine;

import java.util.List;

public class SelectionState implements State {

    public SelectionState(){}

    public SelectionState(VendingMachine vendingMachine){
    }

    @Override
    public void ClickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {

    }
    @Override
    public void ClickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception{

    }

    @Override
    public void InsertCoin(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You cannot insert coin in Idle state");
    }

    @Override
    public void ChooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("You cannot choose Products");
    }

    @Override
    public int GetChange(int returnChangeMoney) throws Exception {
        throw new Exception("Invalid Action");
    }

    @Override
    public Item DispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("Invalid Action");
    }

    @Override
    public List<Coins> RefundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Invalid Action");
    }

    @Override
    public void UpdateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception {
        throw new Exception("Invalid Action");
    }
}
