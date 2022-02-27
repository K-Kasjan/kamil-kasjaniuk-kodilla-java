package com.kodilla.good.patterns.food2door;

interface Supplier {
    boolean isOrderValid(Order order);
    void process(Order order);
}
