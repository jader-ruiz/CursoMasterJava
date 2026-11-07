package com.jeruiz.proyecto.warehouse;

public class Cleaning extends Product{
    private String components;
    private double liters;

    public Cleaning(String name, double price, String components, double liters) {
        super(name, price);
        this.components = components;
        this.liters = liters;
    }

    public String getComponents() {
        return components;
    }

    public double getLiters() {
        return liters;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncomponents: " + components +
                ", liters: " + liters;
    }
}
