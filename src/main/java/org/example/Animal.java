package org.example;

public class Animal extends Product {
    private final String name;
    private final double price;

    public Animal(String name, double price, int quantity) {
        super(quantity);
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
