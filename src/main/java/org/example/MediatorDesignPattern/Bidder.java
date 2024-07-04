package org.example.MediatorDesignPattern;

public class Bidder implements Colleauge{
    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctioMediator) {
        this.name = name;
        this.auctionMediator = auctioMediator;
    }

    @Override
    public void PlaceBid(int amount) {
        auctionMediator.PlaceBid(amount, this);
    }

    @Override
    public void GetNotification(int amount) {
        System.out.println("Bidder"+name+"Got a notfication"+amount);
    }

    @Override
    public String GetName() {
        return name;
    }
}
