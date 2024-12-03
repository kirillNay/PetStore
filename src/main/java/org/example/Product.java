package org.example;

public abstract class Product {

    Product(int quantity) {
        this.quantity = quantity;
    }

    abstract public String getName();

    abstract public double getPrice();

    public int getQuantity() {
        return quantity;
    }

    protected int quantity;

    void sell(final int amount) {
        if (amount > 0 && amount <= quantity) {
            this.quantity -= amount;
        }
    }

    void sell() {
        if (quantity > 0) {
            quantity -= 1;
        }
    }
}
