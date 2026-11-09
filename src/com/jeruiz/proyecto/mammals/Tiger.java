package com.jeruiz.proyecto.mammals;

public class Tiger extends Feline{
    private String tigerSpecies;

    public Tiger(String habitat, float height, float mLong, float weight, String scientistName, float clawsSize, float speed) {
        super(habitat, height, mLong, weight, scientistName, clawsSize, speed);
    }

    public Tiger(String habitat, float height, float mLong, float weight, String scientistName, float clawsSize, float speed, String tigerSpecies) {
        super(habitat, height, mLong, weight, scientistName, clawsSize, speed);
        this.tigerSpecies = tigerSpecies;
    }

    public String getTigerSpecies() {
        return tigerSpecies;
    }

    private String message;
    @Override
    public String eat() {
        message = "%s %s is eating with his %.1f clawsSize";
        return String.format(message,scientistName,tigerSpecies,clawsSize);
    }

    @Override
    public String sleep() {
        message = "The tiger %s is sleeping with a weight of %s";
        return String.format(message,tigerSpecies,weight);
    }

    @Override
    public String run() {
        message = "%s is running at %.1f km per hours";
        return String.format(message,scientistName,speed);
    }

    @Override
    public String communicate() {
        message = "The tiger is communicating with his herd";
        return message;
    }
}
