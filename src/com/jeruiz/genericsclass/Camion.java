package com.jeruiz.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion implements Iterable{
    private List objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        objetos = new ArrayList<>();
    }

    public void add(Object obj){
        if(objetos.size() <= max){
            objetos.add(obj);
        } else {
            throw new RuntimeException("no hay mas espacio");
        }

    }

    @Override
    public Iterator iterator() {
        return objetos.iterator();
    }
}
