package com.jeruiz.poo.interfaces.imprenta.modelo;

import java.util.*;

public class Libro implements Imprimible{
    List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina){
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(titulo).append("\n")
                .append("Autor: ").append(autor).append("\n")
                .append("Genero: ").append(genero).append("\n");
        if(!(paginas.isEmpty())){
            sb.append("Paginas: ")
                    .append("\n");
            int i = 0;
            for (Imprimible p : paginas){
                sb.append(++i)
                        .append(". ")
                        .append(p.imprimir())
                        .append("\n");
            }
        }else sb.append("No hay paginas...");
        return sb.toString();
    }
}
