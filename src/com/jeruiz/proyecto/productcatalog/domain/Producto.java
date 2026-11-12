package com.jeruiz.proyecto.productcatalog.domain;

abstract public class Producto implements IProducto {
    protected int price;

    public Producto(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "price: " + price;
    }
}
