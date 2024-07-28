package org.example.BookMyShow.Theatre;

import org.example.BookMyShow.Enums.City;
import org.example.BookMyShow.Screen.Screen;
import org.example.BookMyShow.Show.Show;

import java.util.List;

public class Theatre {
    String theatreId;
    String address;
    City city;
    List<Screen> screenList ;
    List<Show> showList;

    public String getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(String theatreId){
        this.theatreId = theatreId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}
