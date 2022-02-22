package com.kodilla.good.patterns.challenges;

public class BusinessUser implements ServiceUser{
    private String name;

    public BusinessUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
