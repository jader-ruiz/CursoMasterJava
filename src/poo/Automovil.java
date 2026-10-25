package poo;

import java.util.Objects;

public class Automovil {
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidad;

    public Automovil(){
        capacidad = 40;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidad) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public double getCilindrada() {
        return cilindrada;
    }
    public String getColor() {
        return color;
    }
    public String getModelo() {
        return modelo;
    }
    public String getFabricante() {
        return fabricante;
    }


    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public String detalle(){
        return "\nauto.fabricante = ".concat(fabricante).concat("\nauto.modelo = ").concat("\nauto.color = ").concat(color).concat("\nauto.cilindrada = ").concat(String.valueOf(cilindrada));
    }
    public String acelerar(int rpm){
        return fabricante + " esta acelerando a " + rpm + "rpm (REVOLUCIONES POR MINUTO)";
    }
    public String frenar(){
        return "Se ha frenado el " + fabricante;
    }
    public String acelerarFrenar(int rpm){
        return acelerar(rpm) + "\n" + frenar();
    }
    public String calcularConsumo(int km, float porcentaje){
        return "por " + km + "km el rendimiento es de: " + km/(porcentaje*capacidad) + "L por km";
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Automovil)) return false;

        Automovil a = (Automovil) obj;
        return Objects.equals(this.fabricante, a.fabricante)
                && Objects.equals(this.color, a.color);
    }
}
