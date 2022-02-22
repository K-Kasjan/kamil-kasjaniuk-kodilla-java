package com.kodilla.good.patterns.challenges;

public interface OrderRequest {
    ServiceUser getSeller();
    ServiceUser getCustomer();
    Basket getBasket();
}
