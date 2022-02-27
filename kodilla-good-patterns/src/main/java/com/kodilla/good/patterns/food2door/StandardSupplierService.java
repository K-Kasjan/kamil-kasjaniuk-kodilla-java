package com.kodilla.good.patterns.food2door;

class StandardSupplierService implements SupplierService {
    private final Supplier supplier;

    StandardSupplierService(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public boolean isOrderValid(Order order) {
        return supplier.isOrderValid(order);
    }

    @Override
    public void process(Order order) {
        if(isOrderValid(order)){
            supplier.process(order);
        }
    }
}
