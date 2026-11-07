package com.jeruiz.proyecto.warehouse;

public class WarehouseExample {
    public static void main(String[] args) {
        Product[] products = new Product[8];

        products[0] = new Cleaning("Broom",3.1,"some",1);
        products[1] = new Cleaning("Rag",1.3,"some",4);

        products[2] = new Dairy("Milk",0.88,2,20);
        products[3] = new Dairy("Cheese",1.4,3,12);

        products[4] = new Fruit("Strawberry",3.4,300,"red");
        products[5] = new Fruit("Watermelon",2.6,200,"green and red");

        products[6] = new NonPerishable("Tuna",6.7,1,230);
        products[7] = new NonPerishable("Peas",4.6,1,400);

        int i = -1;
        for (Product product : products){
            System.out.println(product);
            System.out.println();
            if(i%2 == 0){
                System.out.println();
            }
            i++;
        }
    }

}
