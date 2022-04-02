package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity = 0;
    private BigDecimal value;

    public Item(){}

    public Item(Product product, BigDecimal price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        setValue();
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    @NotNull
    public BigDecimal getPrice() {
        return price;
    }

    @NotNull
    public int getQuantity() {
        return quantity;
    }

    @NotNull
    public BigDecimal getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    private void setValue(){
        this.value = price.multiply(BigDecimal.valueOf(quantity));
    }
}
