package org.example;

public class Food extends Product {
    private final String type;
    private final double price;
    private int quantity;

    public Food(String type, double price, int quantity) {
        super(quantity);
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void sell(int amount) {
        if (amount > 0 && amount * stackSize <= quantity) {
            quantity -= amount * stackSize;
        }
    }

    @Override
    void sell() {
        if (quantity >= stackSize) {
            quantity -= stackSize;
        }
    }

    private static final int stackSize = 10;
}
