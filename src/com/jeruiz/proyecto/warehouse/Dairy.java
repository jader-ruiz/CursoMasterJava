package com.jeruiz.proyecto.warehouse;

public class Dairy extends Product{
    private int amount;
    private int proteins;

    public Dairy(String name, double price, int amount, int proteins) {
        super(name, price);
        this.amount = amount;
        this.proteins = proteins;
    }

    public int getAmount() {
        return amount;
    }
    public int getProteins() {
        return proteins;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\namount: " + amount +
                ", proteins: " + proteins;
    }
}
