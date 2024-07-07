package org.example.CarRentalSystem_ZoomCar;

public class Payment {

    public void payBill(Bill bill) {
        //do payment processing and update the bill status;
        bill.isBillPaid = true;
        return;
    }
}
