package com.jeruiz.poo.interfaces.imprenta.modelo;

import java.util.*;

public class Curriculum extends Hoja implements Imprimible{

    private String persona;
    private String carrera;
    private List<String> experencia;

    public Curriculum(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        experencia = new ArrayList<>();
    }

    public Curriculum addExperiencia(String ex){
        experencia.add(ex);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Profesion: ").append(carrera).append("\n")
                .append("Resumen: ").append(contenido).append("\n");
        if(!experencia.isEmpty()){
            sb.append("Experiencia:");
            for (String s : experencia){
                sb.append("\n").append(s);
            }
        }else sb.append("No hay experiencia...");
        return sb.toString();
    }
}
