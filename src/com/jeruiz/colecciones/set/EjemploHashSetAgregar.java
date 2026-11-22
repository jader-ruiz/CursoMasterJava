package com.jeruiz.colecciones.set;

import java.util.HashSet;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        // un hashSet es desordenado, no tiene orden. No como un arreglo que si tiene.
        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");

        System.out.println(hs);

        // no permite elementos duplicados
        System.out.println(hs.add("Two"));
        System.out.println(hs);
    }
}
