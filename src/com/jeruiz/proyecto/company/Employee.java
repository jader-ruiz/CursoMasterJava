package com.jeruiz.proyecto.company;

public class Employee extends Person{
    private double remuneration;
    private int idEmployee;
    private static int lastId;

    public Employee(String name, String lastName, String fiscalNumber, String address, double remuneration) {
        super(name, lastName, fiscalNumber, address);
        this.remuneration = remuneration;
        idEmployee = ++lastId;
    }

    public double getRemuneration() {
        return remuneration;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public static int getLastId() {
        return lastId;
    }

    public void remunerationIncrease(int percentage){
        remuneration += (remuneration*percentage)/100;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nremuneration: " + remuneration +
                ", idEmployee: " + idEmployee;
    }
}
