package com.jeruiz.poo.interfaces.repositorio;

import com.jeruiz.poo.interfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepository {
    List<Cliente> show(String campo, Direccion dir);

}
