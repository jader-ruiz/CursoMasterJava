package com.jeruiz.generics;

import com.jeruiz.poo.interfaces.modelo.Cliente;

import java.util.*;

public class EjemploGenericos {
    public static void main(String[] args) {
        List clientes = new ArrayList();
        clientes.add(new Cliente("Jader","Ruiz"));

        Cliente andres = (Cliente) clientes.iterator().next();

        Cliente[] clientesArr = {new Cliente("Jader","Ruiz"),
            new Cliente("Luis","Ruiz")};

        Integer[] enteros = {1,2,3,4};

        List<Cliente> clients = fromArrayToList(clientesArr);
        List<Integer> integers = fromArrayToList(enteros);

        List<Cliente> clientesPr = fromArrayToList(new Cliente[]{new Cliente("Penelope","Franchesca")});

        imprimirClientes(clientesPr);

        System.out.println("Maximo de 1, 9 y 4 es: " + comparar(1,9,4));
        System.out.println("Maximo de 3.9, 11.6, 7.21 es: " + comparar(3.9, 11.6, 7.21));
        System.out.println("Maximo de \"carrot\", \"apple\" y \"blueberry\" es: " + comparar("carrot","apple","blueberry"));

    }

    // Create the generic method with <T>: generic parameter
    public static <T extends Cliente> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){
        for(G element : g){
            System.out.println(element);
        }
        return Arrays.asList(c);
    }

    // Bounded generic: limit the parameter
    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){ clientes.forEach(System.out::println); }

    public static <T extends Comparable<T>> T comparar(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0) max = b;
        if(c.compareTo(max) > 0) max = c;
        return max;
    }
}
