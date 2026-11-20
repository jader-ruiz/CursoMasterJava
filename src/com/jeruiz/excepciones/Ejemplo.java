package com.jeruiz.excepciones;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero");
        String numero = sc.nextLine();

        Calculadora calculadora = new Calculadora();

        int divisor;
        double division;

        try {
            divisor = Integer.parseInt(numero);
            division = calculadora.dividir(10, divisor);
            System.out.println(division);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        catch (DivisionPorZeroException e) {
            System.err.println("Error al ejecutar el operacion: " + e.getMessage());
        }
    }
}
