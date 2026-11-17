package com.jeruiz.proyecto.marketbag.repository;

import com.jeruiz.proyecto.marketbag.model.Product;

import java.util.List;

public interface InOut<T extends Product> {
    void addList(T t);
    List<T> getList();
}
