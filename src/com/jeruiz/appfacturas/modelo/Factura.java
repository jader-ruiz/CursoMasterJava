package com.jeruiz.appfacturas.modelo;

import java.util.Date;

public class Factura {
    private int id;
    private static int ultimoId;
    private int indiceItems;
    private Cliente cliente;
    private itemFactura[] items;
    private String descripcion;
    private Date fecha;
    public static final int MAX_ITEMS = 10;

    public Factura(Cliente cliente, String descripcion) {
        id = ++ultimoId;
        this.cliente = cliente;
        this.descripcion = descripcion;
        items = new itemFactura[MAX_ITEMS];
        fecha = new Date();
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public itemFactura[] getItems() {
        return items;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addItemFactura(itemFactura item){
        if(indiceItems < MAX_ITEMS) this.items[indiceItems++] = item;
    }

    public double calcularTotal(){
        double total = 0;
        for(itemFactura item : items){
            if(item != null) total += item.calcularImporte();
        }
        return total;
    }

    public String mostrarDetalle(){
        StringBuilder sb = new StringBuilder("Factura #");
        sb.append(id)
                .append("\nCliente: ")
                .append(cliente.getNombre())
                .append("\tId: ")
                .append(cliente.getId())
                .append("\nDescripcion: ")
                .append(descripcion)
                .append("\nFecha: ")
                .append(fecha)
                .append("\nItems: ");
        for(itemFactura item : items){
            if(item == null) continue;
            sb.append("\n\nCodigo: ")
                    .append(item.getProducto().getCodigo())
                    .append("\nNombre: ")
                    .append(item.getProducto().getNombre())
                    .append("\nPrecio: ")
                    .append(item.getProducto().getPrecio())
                    .append("\nCantidad ")
                    .append(item.getCantidad())
                    .append("Total: ")
                    .append(item.calcularImporte());
        }
        sb.append("\n\nTotal: ")
                .append(calcularTotal());
        return sb.toString();
    }
}
