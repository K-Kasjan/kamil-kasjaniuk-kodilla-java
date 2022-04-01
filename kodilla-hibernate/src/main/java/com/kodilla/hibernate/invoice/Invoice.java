package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Invoice {
    private int id;
    private String number;
    private List<Item> items = new LinkedList<>();

    public Invoice(){}

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(unique = true)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @OneToMany(
                targetEntity = Item.class,
                cascade = CascadeType.ALL,
                fetch = FetchType.LAZY
    )
    @JoinColumn(name = "invoice_id")
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
