package com.kodilla.good.patterns.food2door;

import java.util.Objects;

class GlutenFreeShopSupplier implements Supplier{
    private final SupplierStorage supplierStorage;

    GlutenFreeShopSupplier(SupplierStorage supplierStorage) {
        this.supplierStorage = supplierStorage;
    }

    @Override
    public boolean isOrderValid(Order order) {
        Objects.requireNonNull(order);
        return order.getArticleEanList().stream()
                .allMatch(article -> supplierStorage.getArticleByEan(article).ifAvailable());
    }

    @Override
    public void process(Order order) {
        System.out.println("Order to GlutenFreeShop:");
        order.getArticleEanList().forEach(System.out::println);
        sendOrderToSupplierQueue(order);
    }
    private void sendOrderToSupplierQueue(Order order){
        System.out.println("Sending to suppliers queue");
    }
}