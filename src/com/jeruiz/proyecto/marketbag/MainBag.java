package com.jeruiz.proyecto.marketbag;

import com.jeruiz.proyecto.marketbag.model.Cleaning;
import com.jeruiz.proyecto.marketbag.repository.*;

public class MainBag {
    public static void main(String[] args) {
        InOut<Cleaning> cleaningBag = new MarketBag<>();
        cleaningBag.addList(new Cleaning("Detergente", 2.66, "Tensioactivos", 1.5));
        cleaningBag.addList(new Cleaning("Cloro", 1.50, "Hipoclorito", 2.0));

        System.out.println("=== Productos de Limpieza ===");
        for (Cleaning item : cleaningBag.getList()) {
            System.out.println("Nombre: " + item.getName()
                    + " | Precio: " + item.getPrice()
                    + " | Componentes: " + item.getComponents()
                    + " | Litros: " + item.getLiters());
        }


    }
}
