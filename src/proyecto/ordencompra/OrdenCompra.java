package proyecto.ordencompra;

import java.util.Date;

public class OrdenCompra {
    private final int id;
    private final String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private static int ultimoId;

    public OrdenCompra(String descripcion){
        id = ++ultimoId;
        this.descripcion = descripcion;
        productos = new Producto[4];
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto, int posicion){
        productos[posicion] = producto;
    }

    public int granTotal() {
        int total = 0;
        for (Producto p : productos) {
            // Es importante validar que p no sea null por si el cliente agregó menos de 4 productos
            if (p != null) {
                total += p.getPrecio();
            }
        }
        return total;
    }

    public void imprimir() {
        System.out.println("=======================================");
        System.out.println("Orden ID: " + id);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Productos:");

        for (Producto p : productos) {
            if (p != null) {
                System.out.println("- " + p.getNombre() + " (" + p.getFabricante() + "): $" + p.getPrecio());
            }
        }
        System.out.println("Total de la orden: $" + granTotal());
        System.out.println("=======================================\n");
    }
}
