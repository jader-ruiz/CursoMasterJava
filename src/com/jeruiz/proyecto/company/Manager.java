package com.jeruiz.proyecto.company;

public class Manager extends Employee {
    private double budget;

    public Manager(String name, String lastName, String fiscalNumber, String address, double remuneration) {
        super(name, lastName, fiscalNumber, address, remuneration);
    }

    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nbudget: " + budget;
    }
}
