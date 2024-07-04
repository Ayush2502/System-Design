package org.example.MediatorDesignPattern;

public interface AuctionMediator {
    void AddBidder(Colleauge bidder);
    void PlaceBid(int amount, Colleauge bidder);

}
