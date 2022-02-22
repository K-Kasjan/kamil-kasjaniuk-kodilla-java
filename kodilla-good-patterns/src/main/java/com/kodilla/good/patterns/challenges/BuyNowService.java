package com.kodilla.good.patterns.challenges;

public class BuyNowService implements OrderService{
    @Override
    public boolean newOrder(ServiceUser seller, ServiceUser customer, Basket basket) {
        System.out.println("Placed!");
        return true;
    }
}
