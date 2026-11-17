package com.jeruiz.proyecto.marketbag.model;

public class Fruit extends Product{
    private double weight;
    private String color;

    public Fruit(String name, double price, double weight, String color){
        super(name, price);
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }
    public String getColor() {
        return color;
    }

}
