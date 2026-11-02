package com.jeruiz.appfacturas.modelo;

public class Producto {
    private int codigo;
    private static int ultimoCodigo;
    private String nombre;
    private double precio;

    public Producto() {
        codigo = ++ultimoCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
