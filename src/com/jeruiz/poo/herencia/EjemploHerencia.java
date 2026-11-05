package com.jeruiz.poo.herencia;

import com.jeruiz.appfacturas.modelo.Producto;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        Profesor profesor = new Profesor();

        alumno.setNombre("Jader");
        alumno.setApellido("Ruiz");
        alumno.setNombreColegio("Jonh F Kennedy");
        alumno.setNotaCastellano(3.5);
        alumno.setNotaHisoria(3.3);
        alumno.setNotaMatematica(4.5);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Pablo");
        alumnoInternacional.setApellido("Perez");
        alumnoInternacional.setPais("Peru");
        alumnoInternacional.setEdad(14);
        alumnoInternacional.setNombreColegio("Jhon F Kennedy");
        alumnoInternacional.setNotaIdiomas(4.2);
        alumnoInternacional.setNotaCastellano(3.7);


        profesor.setNombre("Luis");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getNombre()
        + " " + profesor.getAsignatura());

        System.out.println("Alumno Internacional: " + alumnoInternacional.getNombre()
        + " " + alumnoInternacional.getApellido() + " " + alumnoInternacional.getPais());

        Class claseAlumInt = alumnoInternacional.getClass();
        while (claseAlumInt.getSuperclass() != null){
            String hija = claseAlumInt.getName();
            String padre = claseAlumInt.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            claseAlumInt = claseAlumInt.getSuperclass();
        }
    }
}
