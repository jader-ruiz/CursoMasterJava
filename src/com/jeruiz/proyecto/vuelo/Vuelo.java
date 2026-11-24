package com.jeruiz.proyecto.vuelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private LocalDateTime fechaLlegada;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private int cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino, String formatFecha, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        fechaLlegada = LocalDateTime.parse(formatFecha, FORMATTER);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String toString(){
        return STR."\{nombre}: \{origen}, aterrizo el \{fechaLlegada.format(FORMATTER)}";
    }
}
