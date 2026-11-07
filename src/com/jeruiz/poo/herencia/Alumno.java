package com.jeruiz.poo.herencia;

public class Alumno extends Persona{
    private String nombreColegio;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHisoria;

    public Alumno(){
        System.out.println("Alumno...");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String nombreColegio){
        super(nombre, apellido, edad);
        this.nombreColegio = nombreColegio;
    }

    public Alumno(String nombre, String apellido, int edad, String nombreColegio, double notaMatematica, double notaCastellano, double notaHisoria) {
        this(nombre, apellido, edad, nombreColegio);
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHisoria = notaHisoria;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHisoria() {
        return notaHisoria;
    }

    public void setNotaHisoria(double notaHisoria) {
        this.notaHisoria = notaHisoria;
    }

    @Override
    public String saludar(){
        return super.saludar() + " soy estudiante...";
    }
}
