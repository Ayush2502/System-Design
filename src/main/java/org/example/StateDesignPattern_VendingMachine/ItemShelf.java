package org.example.StateDesignPattern_VendingMachine;

public class ItemShelf {
    int code;
    Item item;
    boolean available;

    public ItemShelf(int code, Item item, boolean available) {
        this.code = code;
        this.item = item;
        this.available = available;
    }

    public ItemShelf() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isAvailable(boolean b) {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public boolean isAvailable(){
        return available;
    }
}
