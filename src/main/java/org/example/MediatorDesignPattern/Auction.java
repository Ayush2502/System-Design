package org.example.MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{
    List<Colleauge> colleaugeList  = new ArrayList<>();
    @Override
    public void AddBidder(Colleauge bidder) {
        colleaugeList.add(bidder);
    }

    @Override
    public void PlaceBid(int amount, Colleauge bidder) {
        for(Colleauge colleauge:colleaugeList){
            if (!colleauge.GetName().equals(bidder.GetName())){
                colleauge.GetNotification(amount);
            }
        }
    }
}
