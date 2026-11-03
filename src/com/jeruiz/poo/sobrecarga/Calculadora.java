package com.jeruiz.poo.sobrecarga;

public class Calculadora {

    private Calculadora() {

    }

    public static int sumar(int ... argumentos){
        int total = 0;
        for(int i: argumentos){
            total += i;
        }
        return total;
    } // VARIOS PARAMETROS DEL MISMO TIPO

    public static int sumar(int a, int b){
        return a + b;
    }

    public static float sumar(float a, float b){
        return a + b;
    }

    public static float sumar(int i, float j){
        return i + j;
    }

    public static float sumar(float i, int j){
        return i + j;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static int sumar(String x, String y){
        int resultado;
        try{
            resultado = Integer.parseInt(x) + Integer.parseInt(y);
        }catch (NumberFormatException e){
            resultado = 0;
        }
        return resultado;
    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }

    // SI EL METODO NO ESTA TRABAJANDO CON NINGUNA VARIABLE DE LA CLASE, PUEDE SER STATIC

}
