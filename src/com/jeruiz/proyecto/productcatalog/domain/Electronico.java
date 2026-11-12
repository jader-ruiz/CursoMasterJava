package com.jeruiz.proyecto.productcatalog.domain;

abstract class Electronico extends Producto implements IElectronico{
    protected String manufacturer;

    public Electronico(int price,String manufacturer) {
        super(price);
        this.manufacturer = manufacturer;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString(){
        return super.toString() + "\nManufacturer: " + manufacturer;
    }
}
