package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Item {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;
    @NotNull
    private BigDecimal price;
    @NotNull
    private int quantity = 0;
    @NotNull
    private BigDecimal value;

    public Item(){}

    public Item(Product product, BigDecimal price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        setValue();
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    private void setValue(){
        this.value = price.multiply(BigDecimal.valueOf(quantity));
    }
}
