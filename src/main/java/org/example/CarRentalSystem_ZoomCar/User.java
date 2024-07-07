package org.example.CarRentalSystem_ZoomCar;

public class User {
    int userID;
    int userName;
    String contactNumber;
    String drivingLicense;

    public User(int userID, int userName, String contactNumber, String drivingLicense) {
        this.userID = userID;
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.drivingLicense = drivingLicense;
    }

    public User() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserName() {
        return userName;
    }

    public void setUserName(int userName) {
        this.userName = userName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}
