package org.example.StateDesignPattern_VendingMachine;

import java.util.List;

public interface State {

    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void insertCoins(VendingMachine vendingMachine,Coins coins) throws Exception;
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception;
    public void selectProducts(VendingMachine vendingMachine,int itemNumber) throws Exception;
    public void getChange(int getChangedAmount) throws Exception;
    public List<Coins> getFullRefund(VendingMachine vendingMachine) throws Exception;
    public Item DispenseProduct(VendingMachine vendingMachine,int itemNumber) throws Exception;
    public void updateInventory(VendingMachine vendingMachine,Item item,int itemNumber) throws Exception;
}
