package org.example.StateDesignPattern_VendingMachine;

public class Inventory {
    ItemShelf itemShelf[] = null;

    Inventory(int itemCount){
        itemShelf = new ItemShelf[itemCount];

    }
    public ItemShelf[] getInventory(){
        return itemShelf;
    }
    public void setInventory(ItemShelf[] itemShelf){
        this.itemShelf = itemShelf;
    }
    public void initialEmptyInventory(){
        int startCode = 101;
        for(int i=0;i<itemShelf.length;i++){
            ItemShelf temp = new ItemShelf();
            temp.setCode(startCode++);
            temp.setSoldOut(true);
            itemShelf[i] = temp;
        }
    }
    public void addItem(Item item,int codeNumber) throws Exception{
        for(ItemShelf itemShelf1:itemShelf){
            if(itemShelf1.code == codeNumber){
                if(itemShelf1.isSoldOut()){
                    itemShelf1.item = item;
                    itemShelf1.setSoldOut(false);
                }
                else{
                    throw new Exception("already item is present , you cannot add here");
                }
            }
        }
    }

}
