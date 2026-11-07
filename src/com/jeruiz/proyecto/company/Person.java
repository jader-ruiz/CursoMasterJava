package com.jeruiz.proyecto.company;

public class Person {
    private String name;
    private String lastName;
    private String fiscalNumber;
    private String address;

    public Person(String name, String lastName, String fiscalNumber, String address) {
        this.name = name;
        this.lastName = lastName;
        this.fiscalNumber = fiscalNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFiscalNumber() {
        return fiscalNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", lastName: " + lastName +
                ", fiscalNumber: " + fiscalNumber +
                ", address: " + address;
    }
}
