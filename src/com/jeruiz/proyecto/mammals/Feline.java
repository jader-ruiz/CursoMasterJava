package com.jeruiz.proyecto.mammals;

abstract class Feline extends Mammal{
    protected float clawsSize;
    protected float speed;

    public Feline(String habitat, float height, float mLong, float weight, String scientistName) {
        super(habitat, height, mLong, weight, scientistName);
    }

    public Feline(String habitat, float height, float mLong, float weight, String scientistName, float clawsSize, float speed) {
        super(habitat, height, mLong, weight, scientistName);
        this.clawsSize = clawsSize;
        this.speed = speed;
    }

    public float getClawsSize() {
        return clawsSize;
    }
    public float getSpeed() {
        return speed;
    }
}
