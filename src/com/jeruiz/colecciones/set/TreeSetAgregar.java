package com.jeruiz.colecciones.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetAgregar {
    public static void main(String[] args) {
        // Elementos ordenados, pero mas consumo de rendimiento
        Set<String> ts = new TreeSet<>();

        ts.add("Jeje");
        ts.add("Jaja");
        ts.add("Juju");

        System.out.println(ts);

        // Pero tampoco permite elementos duplicados
        ts.add("Jaja");
        System.out.println(ts);

        Set<Integer> num = new TreeSet<>();
        num.add(9);
        num.add(2);
        num.add(6);
        num.add(4);
        System.out.println(num);
        // Se organiza automaticamente con un comparator
    }
}
