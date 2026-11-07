package com.jeruiz.proyecto.company;

public class CompanyExample {
    public static void main(String[] args) {
        Manager manager = new Manager("Jader","Ruiz","1042-23","Kr 22",33000);
        manager.remunerationIncrease(23);
        manager.setBudget(2000000);
        System.out.println(manager);

        Client client = new Client("Luis","Ruiz","2230-23","Kr 77");
        System.out.println(client);
    }
}
