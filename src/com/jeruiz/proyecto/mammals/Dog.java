package com.jeruiz.proyecto.mammals;

public class Dog extends Canine {
    private int biteForce; // PSI

    public Dog(String habitat, float height, float mLong, float weight, String scientistName, String color, float sizeFangs, int biteForce) {
        super(habitat, height, mLong, weight, scientistName, color, sizeFangs);
        this.biteForce = biteForce;
    }

    public int getBiteForce() {
        return biteForce;
    }

    @Override
    public String eat() {
        return String.format("The African Wild Dog uses its %.1f cm fangs to feed with its pack.", sizeFangs);
    }

    @Override
    public String sleep() {
        return String.format("The wild dog with %s fur sleeps together in the dens of %s.", color, habitat);
    }

    @Override
    public String run() {
        return String.format("The wild dog runs relentlessly, covering %.2f m long terrain.", mLong);
    }

    @Override
    public String communicate() {
        return String.format("The wild dog communicates with vocalizations backed by a bite force of %d PSI.", biteForce);
    }
}