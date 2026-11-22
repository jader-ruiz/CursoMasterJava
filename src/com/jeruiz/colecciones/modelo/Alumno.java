package com.jeruiz.colecciones.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private int nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + ", Nota: " + nota;
    }

    @Override
    public int compareTo(Alumno a) {
        /*if(nombre == null){
            return 0;
        }*/
        return Integer.compare(nota,a.nota);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return nota == alumno.nota && Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
