package org.example.StateDesignPattern_VendingMachine;

import java.util.List;

public interface State {

    public void ClickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;

    public void ClickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception;
    public void InsertCoin(VendingMachine vendingMachine) throws Exception;
    public void ChooseProduct(VendingMachine vendingMachine,int productCode) throws Exception;
    public int GetChange(int returnChangeMoney) throws Exception;
    public Item DispenseProduct(VendingMachine vendingMachine,int productCode) throws  Exception;
    public List<Coins> RefundFullMoney(VendingMachine vendingMachine) throws Exception;
    public void UpdateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception;
}
