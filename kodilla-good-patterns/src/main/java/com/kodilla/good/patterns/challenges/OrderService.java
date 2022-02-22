package com.kodilla.good.patterns.challenges;

public interface OrderService {
    boolean newOrder(ServiceUser seller,ServiceUser customer,Basket basket);
}
