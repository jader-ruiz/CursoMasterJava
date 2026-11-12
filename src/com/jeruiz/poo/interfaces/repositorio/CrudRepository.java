package com.jeruiz.poo.interfaces.repositorio;

import com.jeruiz.poo.interfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepository {
    List<Cliente> show();
    Cliente perId(int id);
    void insert(Cliente cliente);
    void edit(Cliente cliente);
    void delete(int id);
}
