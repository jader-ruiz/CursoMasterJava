package com.jeruiz.proyecto.productcatalog.domain;

public class Phone extends Electronico{
    private String color;
    private String model;

    public Phone(int price,String manufacturer,String color, String model){
        super(price, manufacturer);
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    @Override
    public double getSalePrice() {
        return 0;
    }

    @Override
    public String toString(){
        return super.toString() + "\nModel: " + model + ", Color: " + color;
    }
}
