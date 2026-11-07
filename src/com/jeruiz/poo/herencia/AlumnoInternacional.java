package com.jeruiz.poo.herencia;

public class AlumnoInternacional extends Alumno {
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional(){
        System.out.println("Alumno Internacional...");
    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, int edad, String pais) {
        super(nombre, apellido, edad);
        this.pais = pais;
    }

    public AlumnoInternacional(String nombre, String apellido, int edad, String nombreColegio, double notaMatematica, double notaCastellano, double notaHisoria, double notaIdiomas) {
        super(nombre, apellido, edad, nombreColegio, notaMatematica, notaCastellano, notaHisoria);
        this.notaIdiomas = notaIdiomas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return super.saludar() + " Y soy internacional!";
    }
}
