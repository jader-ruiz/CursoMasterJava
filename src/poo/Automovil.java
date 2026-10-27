package poo;

import java.util.Objects;

public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private double cilindrada;
    private int capacidad;
    private static int capacidadStatic;
    private static int ultimoId;
    public static final Integer VELOCIDAD_MAX_CARRETERA = 110;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 50;

    private static Color colorPatente;

    public Automovil(){
        capacidad = 40;
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidad) {
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
    public Color getColor() {
        return color;
    }
    public String getModelo() {
        return modelo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public static Color getColorPatente(){ return colorPatente; }
    public static Integer getVelocidadMaxCarretera(){ return VELOCIDAD_MAX_CARRETERA; }
    public static Integer getVelocidadMaxCiudad(){ return VELOCIDAD_MAX_CIUDAD; }


    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public static void setColorPatente(Color colorPatente){ Automovil.colorPatente = colorPatente; }
    public static void setCapacidadStatic(int capacidadStatic){ Automovil.capacidadStatic = capacidadStatic; }


    public String detalle(){

        return "\nauto.fabricante = " + fabricante + "\nauto.modelo = " + modelo + "\nauto.color = " + color + "\nauto.cilindrada = " + cilindrada + "\nid = " + id;
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
    public static String calcularConsumoStatic(int km, float porcentaje){
        return "por " + km + "km el rendimiento es de: " + km/(porcentaje*capacidadStatic) + "L por km";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Automovil)) return false;
        Automovil a = (Automovil) obj;
        return Objects.equals(this.fabricante, a.fabricante)
                && Objects.equals(this.color, a.color);
    }

    @Override
    public String toString() {
        return "\nAutomovil {" +
                "\nfabricante='" + fabricante + '\'' +
                "\nmodelo='" + modelo + '\'' +
                "\ncolor='" + color + '\'' +
                "\ncilindrada=" + cilindrada +
                "\ncapacidad=" + capacidad +
                "\ncolorPatente='" + colorPatente + '\''+
                "\nid='" + id + '\''+
                "\n}";
    }
}
