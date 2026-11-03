package com.jeruiz.poo.sobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumar int: " + Calculadora.sumar(6,7));
        System.out.println("Sumar float: " + Calculadora.sumar(10.0F, 23F));
        System.out.println("Sumar int-float: " + Calculadora.sumar(4, 55F));
        System.out.println("Sumar float-int: " + Calculadora.sumar(67F, 1));
        System.out.println("Sumar double: " + Calculadora.sumar(44.21,66.7));
        System.out.println("Sumar string: " + Calculadora.sumar("67", "22"));
        System.out.println("Sumar string fallido: " + Calculadora.sumar("Hola", "Pepe"));
        System.out.println("sumar tres int: " + Calculadora.sumar(5,47,9821));

        System.out.println("Sumar long: " + Calculadora.sumar(5L, 66L));
        System.out.println("Sumar int: " + Calculadora.sumar(55, '£'));

        System.out.println("Sumar 6 int: " + Calculadora.sumar(9,6,3,7,5,1));
    }
}
