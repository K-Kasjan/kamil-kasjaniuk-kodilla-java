package com.kodilla.good.patterns.challenges;

public class OrderConsoleCollector implements OrderRepository{

    @Override
    public void createOrder(OrderRequest orderRequest) {
        System.out.println(orderRequest.getBasket().getItems()+" from "+orderRequest.getSeller().getName()+" to "+orderRequest.getCustomer().getName());
    }
}
