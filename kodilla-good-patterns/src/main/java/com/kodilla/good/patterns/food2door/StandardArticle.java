package com.kodilla.good.patterns.food2door;

public class StandardArticle implements StorageArticle{
    private final String ean;
    private final String name;
    private final String unit;
    private final float quantity;
    private final float price;

    public StandardArticle(String ean, String name, float quantity, float price) {
        this.ean = ean;
        this.name = name;
        this.unit = "pieces";
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String getEan() {
        return ean;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    @Override
    public float getQuantity() {
        return quantity;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public boolean ifAvailable(){
        return getQuantity() > 0;
    }
}
