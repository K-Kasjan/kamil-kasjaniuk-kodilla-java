package com.kodilla.good.patterns.food2door;

interface StorageArticle {
    String getEan();
    String getName();
    String getUnit();
    float getQuantity();
    float getPrice();
    boolean ifAvailable();
}
