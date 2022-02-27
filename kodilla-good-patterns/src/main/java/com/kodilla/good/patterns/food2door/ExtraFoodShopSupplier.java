package com.kodilla.good.patterns.food2door;

import java.util.Objects;

class ExtraFoodShopSupplier implements Supplier{
    private final SupplierStorage supplierStorage;

    ExtraFoodShopSupplier(SupplierStorage supplierStorage) {
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
        System.out.println("Order to ExtraFoodShop:");
        order.getArticleEanList().forEach(System.out::println);
    }
}
