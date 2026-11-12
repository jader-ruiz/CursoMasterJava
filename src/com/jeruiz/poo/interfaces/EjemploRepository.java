package com.jeruiz.poo.interfaces;

import com.jeruiz.poo.interfaces.modelo.Cliente;
import com.jeruiz.poo.interfaces.repositorio.*;

import java.util.List;

public class EjemploRepository {
    public static void main(String[] args) {

        All repo = new ClienteListRepository();
        repo.insert(new Cliente("Jader", "Ruiz"));
        repo.insert(new Cliente("Luis", "Ruiz"));
        repo.insert(new Cliente("Gabriela", "Aa"));
        repo.insert(new Cliente("Pepe","Pelele"));

        List<Cliente> clientes = repo.show();
        clientes.forEach(System.out::println);

        System.out.println("===== PAGINABLE =====");
        System.out.println(clientes.subList(1,3));

        System.out.println("===== ORDENABLE =====");
        List<Cliente> sortClients = repo.show("apellido",Direccion.ASC);
        sortClients.forEach(System.out::println);

        System.out.println("===== EDITAR =====");
        Cliente al = new Cliente("Alejandro", "Ruiz");
        al.setId(2);
        repo.edit(al);
        clientes.forEach(System.out::println);

        System.out.println("===== ELIMINAR =====");
        repo.delete(4);
        clientes.forEach(System.out::println);
    }
}
