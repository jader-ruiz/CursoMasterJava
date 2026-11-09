package com.jeruiz.proyecto.mammals;

public class Wolf extends Canine {
    private int packNum;
    private String wolfSpecies;

    public Wolf(String habitat, float height, float mLong, float weight, String scientistName, String color, float sizeFangs, int packNum, String wolfSpecies) {
        super(habitat, height, mLong, weight, scientistName, color, sizeFangs);
        this.packNum = packNum;
        this.wolfSpecies = wolfSpecies;
    }

    public int getPackNum() {
        return packNum;
    }

    public String getWolfSpecies() {
        return wolfSpecies;
    }

    @Override
    public String eat() {
        return String.format("The %s wolf hunts in a pack of %d members using its %.1f cm fangs.", wolfSpecies, packNum, sizeFangs);
    }

    @Override
    public String sleep() {
        return String.format("The %s wolf sleeps inside deep caverns in %s.", color, habitat);
    }

    @Override
    public String run() {
        return String.format("The %s wolf trots across large distances with a height of %.2f m.", wolfSpecies, height);
    }

    @Override
    public String communicate() {
        return String.format("The %s wolf howls at the moon to reunite with its pack.", wolfSpecies);
    }
}