package com.jeruiz.proyecto.mammals;

abstract  class Canine extends Mammal {
    protected String color;
    protected float sizeFangs;

    public Canine(String habitat, float height, float mLong, float weight, String scientistName) {
        super(habitat, height, mLong, weight, scientistName);
    }

    public Canine(String habitat, float height, float mLong, float weight, String scientistName, String color, float sizeFangs) {
        super(habitat, height, mLong, weight, scientistName);
        this.color = color;
        this.sizeFangs = sizeFangs;
    }

    public String getColor() {
        return color;
    }
    public float getSizeFangs() {
        return sizeFangs;
    }
}
