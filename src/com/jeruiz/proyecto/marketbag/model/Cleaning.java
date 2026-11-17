package com.jeruiz.proyecto.marketbag.model;

public class Cleaning extends Product{
    private String components;
    private double liters;

    public Cleaning(String name, double price, String components, double liters) {
        super(name, price);
        this.components = components;
        this.liters = liters;
    }

    public double getLiters() {
        return liters;
    }
    public String getComponents() {
        return components;
    }
}
