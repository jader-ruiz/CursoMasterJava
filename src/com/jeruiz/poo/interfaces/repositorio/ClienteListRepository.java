package com.jeruiz.poo.interfaces.repositorio;

import com.jeruiz.poo.interfaces.modelo.Cliente;

import java.util.*;


public class ClienteListRepository implements All {

    private List<Cliente> dataSource;

    public ClienteListRepository() {
        dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> show() {
        return dataSource;
    }

    @Override
    public Cliente perId(int id) {
        for(Cliente c : dataSource){
            if(id == c.getId()){
                return c;
            }
        }
        return null;
    }

    @Override
    public void insert(Cliente cliente) {
        dataSource.add(cliente);
    }

    @Override
    public void edit(Cliente cliente) {
        Cliente c = perId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void delete(int id) {
        dataSource.remove(perId(id));
    }

    // Ordenar - Sort
    @Override
    public List<Cliente> show(String campo, Direccion dir) {
        List<Cliente> sortList = new ArrayList<>(dataSource);
        sortList.sort((new Comparator<Cliente>() {
                    @Override
                    public int compare(Cliente a, Cliente b) {
                        int resultado = 0;
                        if(dir == Direccion.ASC){
                            resultado = ordenar(a,b);
                        }else if(dir == Direccion.DESC){
                            resultado = ordenar(b,a);
                        }
                        return resultado;
                    }

                    private int ordenar(Cliente a, Cliente b){
                        int resultado = 0;
                        switch (campo){
                            case "id" ->
                                    resultado = Integer.compare(a.getId(),b.getId());
                            case "nombre" ->
                                    resultado = a.getNombre().compareTo(b.getNombre());
                            case "apellido" ->
                                    resultado = a.getApellido().compareTo(b.getApellido());
                        }
                        return resultado;
                    }
                })
        );
        return sortList;
    }

    // Mostrar en un rango - Show in range
    @Override
    public List<Cliente> show(int desde, int limit) {
        return dataSource.subList(desde,limit);
    }
}
