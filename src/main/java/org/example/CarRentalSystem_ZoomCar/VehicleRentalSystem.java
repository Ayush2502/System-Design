package org.example.CarRentalSystem_ZoomCar;

import java.util.List;

public class VehicleRentalSystem {
    List<User> userList;
    List<Store> storeList;
    //Support crud operations on Users and Stores.

    public VehicleRentalSystem(List<User> userList, List<Store> storeList) {
        this.userList = userList;
        this.storeList = storeList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }
}
