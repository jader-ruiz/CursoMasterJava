package com.jeruiz.proyecto.marketbag.repository;

import com.jeruiz.proyecto.marketbag.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MarketBag<T extends Product> implements InOut<T>{

    private List<T> dataSource;
    
    public MarketBag(){
        dataSource = new ArrayList<>();
    }

    @Override
    public void addList(T element) {
        if (this.dataSource.size() < 5) {
            dataSource.add(element);
        } else {
            System.out.println("La bolsa está llena (máximo 5 productos).");
        }
    }

    @Override
    public List<T> getList() {
        return dataSource;
    }
}
