package com.jeruiz.colecciones.set;

import com.jeruiz.colecciones.modelo.Alumno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetUnicidad {
    public static void main(String[] args) {

        // En HashSet se compara por equals, en los objetos se compara por la referencia, hacia donde apunta. Pero antes del equals se hace por HashCode
        // Esto se hace para no repetir. Porque el hashcode es desorganizado

        Set<Alumno> sa = new HashSet<>();

        sa.add(new Alumno("Pepe",4));
        sa.add(new Alumno("Papo", 3));
        sa.add(new Alumno("Jeje",5));
        sa.add(new Alumno("Jiji", 2));

        sa.add(new Alumno("Mafe",3));


        System.out.println(sa);
    }


}
