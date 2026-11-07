package com.jeruiz.poo.herencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor(){
        System.out.println("Profesor...");
    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Profesor(String nombre, String apellido, int edad, String asignatura){
        this(nombre, apellido, edad);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "\nSoy un profesor!";
    }
}
