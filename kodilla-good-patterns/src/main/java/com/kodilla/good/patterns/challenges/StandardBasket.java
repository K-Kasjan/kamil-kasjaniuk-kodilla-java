package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class StandardBasket implements Basket{
    List<String> items;

    public StandardBasket(String item) {
        this.items = new ArrayList<>();
        this.items.add(item);
    }

    public StandardBasket(List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }
}
