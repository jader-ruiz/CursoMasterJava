package com.jeruiz.proyecto.vuelo;

import java.util.List;

public class Main {
    static void main() {
        VueloR v = new VueloR();

        v.addVuelo(new Vuelo("AAL 933", "New York", "Santiago", "29/08/2021 05:39", 62));
        v.addVuelo(new Vuelo("LAT 755", "Sao Paulo", "Santiago", "31/08/2021 04:45", 47));
        v.addVuelo(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", "30/08/2021 16:00", 52));
        v.addVuelo(new Vuelo("DAL 147", "Atlanta", "Santiago", "29/08/2021 13:22", 59));
        v.addVuelo(new Vuelo("AVA 241", "Bogota", "Santiago", "31/08/2021 14:05", 25));
        v.addVuelo(new Vuelo("AMX 10", "Mexico City", "Santiago", "31/08/2021 05:20", 29));
        v.addVuelo(new Vuelo("IBE 6833", "Londres", "Santiago", "30/08/2021 08:45", 55));
        v.addVuelo(new Vuelo("LAT 2479", "Frankfurt", "Santiago", "29/08/2021 07:41", 51));
        v.addVuelo(new Vuelo("SKU 803", "Lima", "Santiago", "30/08/2021 10:35", 48));
        v.addVuelo(new Vuelo("LAT 533", "Los Ángeles", "Santiago", "29/08/2021 09:14", 59));
        v.addVuelo(new Vuelo("LAT 1447", "Guayaquil", "Santiago", "31/08/2021 08:33", 31));
        v.addVuelo(new Vuelo("CMP 111", "Panama City", "Santiago", "31/08/2021 15:15", 29));
        v.addVuelo(new Vuelo("LAT 705", "Madrid", "Santiago", "30/08/2021 08:14", 47));
        v.addVuelo(new Vuelo("AAL 957", "Miami", "Santiago", "29/08/2021 22:53", 60));
        v.addVuelo(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", "31/08/2021 09:57", 32));
        v.addVuelo(new Vuelo("LAT 1283", "Cancún", "Santiago", "31/08/2021 04:00", 35));
        v.addVuelo(new Vuelo("LAT 579", "Barcelona", "Santiago", "29/08/2021 07:45", 61));
        v.addVuelo(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", "30/08/2021 07:12", 58));
        v.addVuelo(new Vuelo("LAT 501", "París", "Santiago", "29/08/2021 18:29", 49));
        v.addVuelo(new Vuelo("LAT 405", "Montevideo", "Santiago", "30/08/2021 15:45", 39));

        List<Vuelo> an = v.ascendente();
        an.forEach(System.out::println);
        System.out.println("\n==============================");
        System.out.println(STR."El ultimo vuelo en llegar es \{v.ultimoVuelo()}");
        Vuelo a = v.menorPasajero();
        System.out.println("\n==============================");
        System.out.println(STR."El vuelo con menor numero de pasajeros es \{a.getNombre()}: \{a.getOrigen()}, con \{a.getCantidadPasajeros()} pasajeros");

    }
}
