package com.jeruiz.proyecto.warehouse;

public class NonPerishable extends Product{
    private int content;
    private int calories;

    public NonPerishable(String name, double price, int content, int calories) {
        super(name, price);
        this.content = content;
        this.calories = calories;
    }

    public int getContent() {
        return content;
    }
    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncontent: " + content +
                ", calories: " + calories;
    }
}