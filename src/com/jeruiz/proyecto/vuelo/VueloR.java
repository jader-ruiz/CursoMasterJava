package com.jeruiz.proyecto.vuelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VueloR {
    private final List<Vuelo> r = new ArrayList<>();

    public void addVuelo(Vuelo v){
        r.add(v);
    }

    public List<Vuelo> ascendente(){
        List<Vuelo> aux = new ArrayList<>(r);
        aux.sort(Comparator.comparing(Vuelo::getFechaLlegada));
        return aux;
    }

    public Vuelo ultimoVuelo(){
        List<Vuelo> aux = ascendente();
        return aux.getLast();
    }

    public Vuelo menorPasajero(){
        List<Vuelo> aux = new ArrayList<>(r);
        aux.sort(Comparator.comparing(Vuelo::getCantidadPasajeros));
        return aux.getFirst();
    }

}
