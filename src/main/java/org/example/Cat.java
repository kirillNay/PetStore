package org.example;

public class Cat extends Animal {
    private boolean vaccinated;

    public Cat(String name, double price, int quantity, boolean vaccinated) {
        super(name, price, quantity);
        this.vaccinated = vaccinated;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
