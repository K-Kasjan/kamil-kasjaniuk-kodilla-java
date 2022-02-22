package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private OrderRequest orderRequest;
    private boolean isOrderPlaced;

    public OrderDto(OrderRequest orderRequest, boolean isOrderPlaced) {
        this.orderRequest = orderRequest;
        this.isOrderPlaced = isOrderPlaced;
    }
}
