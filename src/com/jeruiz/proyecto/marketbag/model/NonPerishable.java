package com.jeruiz.proyecto.marketbag.model;

public class NonPerishable extends Product{
    private int content;
    private int calories;

    public NonPerishable(String name, double price, int content, int calories) {
        super(name, price);
        this.content = content;
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }
    public int getContent() {
        return content;
    }
}
