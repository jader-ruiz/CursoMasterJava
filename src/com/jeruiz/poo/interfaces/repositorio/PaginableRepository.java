package com.jeruiz.poo.interfaces.repositorio;

import com.jeruiz.poo.interfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepository {
    List<Cliente> show(int desde, int limit);
}
