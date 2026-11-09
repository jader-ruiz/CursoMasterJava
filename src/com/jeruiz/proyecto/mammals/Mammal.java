package com.jeruiz.proyecto.mammals;

abstract public class Mammal {
    protected String habitat;
    protected float height;
    protected float mLong;
    protected float weight;
    protected String scientistName;

    public Mammal(String habitat, float height, float mLong, float weight, String scientistName) {
        this.habitat = habitat;
        this.height = height;
        this.mLong = mLong;
        this.weight = weight;
        this.scientistName = scientistName;
    }

    public String getHabitat() {
        return habitat;
    }
    public float getHeight() {
        return height;
    }
    public float getmLong() {
        return mLong;
    }
    public float getWeight() {
        return weight;
    }
    public String getScientistName() {
        return scientistName;
    }

    abstract public String eat();
    abstract public String sleep();
    abstract public String run();
    abstract public String communicate();
}
