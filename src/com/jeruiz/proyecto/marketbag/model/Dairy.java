package com.jeruiz.proyecto.marketbag.model;

public class Dairy extends Product{
    private int count;
    private int protein;

    public Dairy(String name, double price, int count, int protein) {
        super(name, price);
        this.count = count;
        this.protein = protein;
    }

    public int getCount() {
        return count;
    }
    public int getProtein() {
        return protein;
    }
}
