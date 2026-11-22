package com.jeruiz.colecciones.set;

import com.jeruiz.colecciones.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparable {
    public static void main(String[] args) {

        // Podemos utilizar una expresion lambda para determinar que queremos comparar
        Set<Alumno> sa = new TreeSet<>((a, b) -> Integer.compare(b.getNota(), a.getNota()));
        sa.add(new Alumno("Pepe",4));
        sa.add(new Alumno("Papo", 3));
        sa.add(new Alumno("Jeje",5));
        sa.add(new Alumno("Jiji", 2));

        // Como el comparator esta comparando la nota, no puede haber 2 notas repetidas, si se comparara por nombre, si apareceria
        sa.add(new Alumno("Mafe",3));

        // La clase debe tener implementada la interfaz comparable
        System.out.println(sa);
    }
}
