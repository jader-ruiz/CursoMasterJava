package com.jeruiz.proyecto.mammals;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mammal[] mammals = new Mammal[6];

        mammals[0] = new Lion("African Savanna", 1.2f, 2.1f, 190.0f, "Panthera leo", 7.5f, 80.0f, 12, 114.0f);
        mammals[1] = new Tiger("Bengal Jungle", 1.1f, 2.5f, 220.0f, "Panthera tigris", 8.0f, 65.0f, "Bengal Tiger");
        mammals[2] = new Cheetah("Kenyan Plains", 0.9f, 1.5f, 60.0f, "Acinonyx jubatus", 4.0f, 115.0f);
        mammals[3] = new Wolf("North American Forest", 0.85f, 1.4f, 45.0f, "Canis lupus", "Gray", 4.5f, 6, "Gray Wolf");
        mammals[4] = new Dog("Savanna Grasslands", 0.75f, 1.0f, 28.0f, "Lycaon pictus", "Spotted", 3.8f, 317);
        mammals[5] = new Lion("Kruger National Park", 1.25f, 2.2f, 205.0f, "Panthera leo", 7.8f, 78.0f, 8, 118.5f);

        for (Mammal m : mammals) {
            System.out.println("==================================================");
            System.out.println("Class Type        : " + m.getClass().getSimpleName());
            System.out.println("Scientific Name   : " + m.getScientistName());
            System.out.println("Habitat           : " + m.getHabitat());
            System.out.println("Height / Length   : " + m.getHeight() + " m / " + m.getmLong() + " m");
            System.out.println("Weight            : " + m.getWeight() + " kg");
            System.out.println("--------------------------------------------------");
            System.out.println("Eat()             : " + m.eat());
            System.out.println("Sleep()           : " + m.sleep());
            System.out.println("Run()             : " + m.run());
            System.out.println("Communicate()     : " + m.communicate());
            System.out.println();
        }
    }
}