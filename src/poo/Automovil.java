package poo;

import java.util.Objects;

public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Estanque estanque;
    private TipoAutomovil tipo;
    private Persona conductor;
    private Rueda[] ruedas;

    private static int capacidadStatic;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 110;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 50;

    private static Color colorPatente;

    public Automovil(){
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color);
        this.motor = motor;
        this.estanque = estanque;

    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
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

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public static void setColorPatente(Color colorPatente){ Automovil.colorPatente = colorPatente; }
    public static void setCapacidadStatic(int capacidadStatic){ Automovil.capacidadStatic = capacidadStatic; }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String detalle(){

        return "\nauto.fabricante = " + fabricante + "\nauto.modelo = " + modelo + "\nauto.color = " + color + "\nauto.cilindrada = " + motor.getCilindrada() + "\nid = " + id + "\ntipo = " + tipo;
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
        return "por " + km + "km el rendimiento es de: " + km/(porcentaje*estanque.getCapacidad()) + "L por km";
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
        return "\nauto.fabricante = " + fabricante + "\nauto.modelo = " + modelo + "\nauto.color = " + color + "\nauto.cilindrada = " + motor.getCilindrada() + "\nid = " + id + "\ntipo = " + tipo;
    }
}
