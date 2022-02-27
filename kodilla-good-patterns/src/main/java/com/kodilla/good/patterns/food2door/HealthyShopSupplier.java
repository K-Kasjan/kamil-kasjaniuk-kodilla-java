package com.kodilla.good.patterns.food2door;

import java.util.Objects;

public class HealthyShopSupplier implements Supplier{
    private final SupplierStorage supplierStorage;

    public HealthyShopSupplier(SupplierStorage supplierStorage) {
        this.supplierStorage = supplierStorage;
    }

    @Override
    public boolean isOrderValid(Order order) {
        Objects.requireNonNull(order);
        return order.getArticleEanList().stream()
                .allMatch(article -> supplierStorage.getArticleByEan(article) != null);
    }

    @Override
    public void process(Order order) {
        System.out.println("Order to ExtraFoodShop:");
        order.getArticleEanList().forEach(System.out::println);
    }
}