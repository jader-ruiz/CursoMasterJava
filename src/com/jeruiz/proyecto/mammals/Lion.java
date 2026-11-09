package com.jeruiz.proyecto.mammals;

public class Lion extends Feline {
    private int herdNum;
    private float roarPower;

    public Lion(String habitat, float height, float mLong, float weight, String scientistName, float clawsSize, float speed) {
        super(habitat, height, mLong, weight, scientistName, clawsSize, speed);
    }

    public Lion(String habitat, float height, float mLong, float weight, String scientistName, float clawsSize, float speed, int herdNum, float roarPower) {
        super(habitat, height, mLong, weight, scientistName, clawsSize, speed);
        this.herdNum = herdNum;
        this.roarPower = roarPower;
    }

    public int getHerdNum() {
        return herdNum;
    }
    public float getRoarPower() {
        return roarPower;
    }

    @Override
    public String eat() {
        return String.format("The Lion hunts alongside its herd of %d individuals in the %s.", herdNum, habitat);
    }

    @Override
    public String sleep() {
        return String.format("The Lion resting under the shade weighs %.1f kg.", weight);
    }

    @Override
    public String run() {
        return String.format("The %s runs at speed reaching up to %.1f km/h.", scientistName, speed);
    }

    @Override
    public String communicate() {
        return String.format("The Lion roars loudly with a power of %.1f decibels.", roarPower);
    }
}