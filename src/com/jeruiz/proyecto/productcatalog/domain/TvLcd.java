package com.jeruiz.proyecto.productcatalog.domain;

public class TvLcd extends Electronico{
    private int inch;

    public TvLcd(int price, String manufacturer, int inch){
        super(price,manufacturer);
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    @Override
    public double getSalePrice() {
        return 0;
    }

    @Override
    public String toString(){
        return super.toString() + "\nInches: " + inch;
    }
}
