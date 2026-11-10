package com.jeruiz.poo.interfaces.imprenta;

import com.jeruiz.poo.interfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Resumen laboral...","Jader","Ingenieria Sistemas");
        cv.addExperiencia("Java")
                .addExperiencia("Python")
                .addExperiencia("MySQL");

        Libro libro = new Libro("Pepe","Las Aventuras de pepe",Genero.AVENTURA);
        libro.addPagina(new Pagina("Aqui comienza todo..."))
                .addPagina(new Pagina("Erase una vez por alla todo lejos"))
                .addPagina(new Pagina("Y gano la batalla!"));


        Informe informe = new Informe("Presentacion...","Luis","Profesor Lenguas");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
