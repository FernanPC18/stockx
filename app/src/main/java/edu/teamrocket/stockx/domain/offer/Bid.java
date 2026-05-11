package edu.teamrocket.stockx.domain.offer;

public class Bid implements Offer {
    
    private String size;
    private Integer bid;

    public Bid(String size, Integer bid){
        this.size = size;
        this.bid = bid; 
    }

    @Override
    public String size(){
        return this.size;
    }

    @Override
    public int value(){
        return this.bid;
    }

    @Override
    public int compareTo(Offer offer){
        return Integer.compare(this.bid, offer.value());
    }

}