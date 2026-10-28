package proyecto.ordencompra;

import java.util.Date;
import java.util.Scanner;

public class EjemploOrdenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String descripcion;
        String nombre;
        String apellido;
        int contador = 0;

        OrdenCompra[] arregloOrdenes = new OrdenCompra[3];

        for(int i = 1; i <= 3; i++){
            System.out.println(i+". Orden: Ingrese la descripcion ->");
            descripcion = sc.nextLine();

            OrdenCompra orden = new OrdenCompra(descripcion);

            System.out.print("Ingrese el nombre del cliente: ");
            nombre = sc.nextLine();
            System.out.print("Ingrese el apellido del cliente: ");
            apellido = sc.nextLine();
            Cliente cliente = new Cliente(nombre, apellido);

            orden.setCliente(cliente);
            orden.setFecha(new Date());

            contador = 0;
            char op = 0;

            do {
                System.out.println("Desea agregar productos? (Y = Si) (N = No)");
                op = sc.next().charAt(0);
                sc.nextLine();

                switch (op){
                    case 'Y' -> {
                        if(contador >= orden.getProductos().length){
                            System.out.println("Maximo productos...");
                            break;
                        }
                        System.out.print("Fabricante: ");
                        String fabricante = sc.nextLine();
                        System.out.print("Nombre: ");
                        String nombreP = sc.nextLine();
                        System.out.print("Precio: ");
                        int precio = sc.nextInt();
                        sc.nextLine();

                        Producto producto = new Producto(fabricante,nombreP,precio);
                        orden.addProducto(producto, contador);
                        contador++;
                    }
                    case 'N' -> {
                        System.out.println("Finalizando ingreso de productos para la orden " + i);
                    }
                    default -> {
                        System.out.println("Caracter invalido...");
                    }
                }

            } while (op != 'N' && contador < orden.getProductos().length);

            arregloOrdenes[i-1] = orden;
        }

        System.out.println("\nRESUMEN DE ÓRDENES DE COMPRA:");
        for (OrdenCompra o : arregloOrdenes) {
            o.imprimir();
        }

    }
}
