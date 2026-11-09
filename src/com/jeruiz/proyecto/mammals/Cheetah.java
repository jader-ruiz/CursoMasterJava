package com.jeruiz.proyecto.mammals;

public class Cheetah extends Feline {

    public Cheetah(String habitat, float height, float mLong, float weight, String scientistName, float clawsSize, float speed) {
        super(habitat, height, mLong, weight, scientistName, clawsSize, speed);
    }

    @Override
    public String eat() {
        return String.format("The Cheetah (%s) consumes its prey quickly in %s to avoid scavengers.", scientistName, habitat);
    }

    @Override
    public String sleep() {
        return String.format("The Cheetah rests after an intense run, relying on its %.1f cm claws for stability.", clawsSize);
    }

    @Override
    public String run() {
        return String.format("The Cheetah bursts into maximum acceleration at %.1f km/h.", speed);
    }

    @Override
    public String communicate() {
        return "The Cheetah makes high-pitched chirping sounds to signal its presence.";
    }
}