package com.jeruiz.poo.herencia;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Jader","Ruiz",18,"Jonh F Kennedy");
        alumno.setNotaCastellano(3.5);
        alumno.setNotaHisoria(3.3);
        alumno.setNotaMatematica(4.5);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Pablo","Perez",14,"Peru");
        alumnoInternacional.setNombreColegio("Jhon F Kennedy");
        alumnoInternacional.setNotaIdiomas(4.2);
        alumnoInternacional.setNotaCastellano(3.7);

        Profesor profesor = new Profesor("Luis","Ortiz",27,"Matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getNombre()
                + " " + profesor.getAsignatura());

        System.out.println("Alumno Internacional: " + alumnoInternacional.getNombre()
                + " " + alumnoInternacional.getApellido() + " " + alumnoInternacional.getPais());

        Persona persona = new Persona();
        System.out.print("===== - =====");
        System.out.println(persona.saludar());
        System.out.println(alumno.saludar());
        System.out.println(alumnoInternacional.saludar());
        System.out.println(profesor.saludar());
    }
}
