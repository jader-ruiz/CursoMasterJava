package com.jeruiz.appfacturas;

import com.jeruiz.appfacturas.modelo.*;
import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jader", "67-23");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la descripcion de la factura: ");
        String descripcion = sc.nextLine();
        Factura factura = new Factura(cliente,descripcion);

        Producto producto;
        String nombre;
        double precio;
        int cantidad;

        System.out.println();

        for (int i = 0; i<5; i++){
            producto = new Producto();
            System.out.println("Producto #"+producto.getCodigo());
            System.out.println("Ingrese el nombre:");
            producto.setNombre(sc.next());

            System.out.println("Ingrese el precio:");
            producto.setPrecio(sc.nextDouble());

            System.out.println("Ingrese la cantidad:");
            factura.addItemFactura(new itemFactura(producto, sc.nextInt()));

            System.out.println();
        }
        System.out.println(factura.mostrarDetalle());
    }

}
