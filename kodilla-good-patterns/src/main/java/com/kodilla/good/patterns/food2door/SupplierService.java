package com.kodilla.good.patterns.food2door;

interface SupplierService {
    boolean isOrderValid(Order order);
    void process(Order order);
}
