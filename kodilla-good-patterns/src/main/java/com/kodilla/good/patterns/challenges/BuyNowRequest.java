package com.kodilla.good.patterns.challenges;

public class BuyNowRequest implements OrderRequest{
    private ServiceUser seller,customer;
    private Basket basket;

    public BuyNowRequest(ServiceUser seller, ServiceUser customer, Basket basket) {
        this.seller = seller;
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public ServiceUser getSeller() {
        return seller;
    }

    @Override
    public ServiceUser getCustomer() {
        return customer;
    }

    @Override
    public Basket getBasket() {
        return basket;
    }
}
