package com.jeruiz.excepciones;

public class DivisionPorZeroException extends Exception{
    public DivisionPorZeroException(String mensaje){
        super(mensaje);
    }
}
