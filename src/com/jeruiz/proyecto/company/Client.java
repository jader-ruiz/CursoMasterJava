package com.jeruiz.proyecto.company;

public class Client extends Person{
    private int idClient;
    private static int lastId;

    public Client(String name, String lastName, String fiscalNumber, String address) {
        super(name, lastName, fiscalNumber, address);
        idClient = ++lastId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nidClient: " + idClient;
    }
}
