package com.jeruiz.proyecto.productcatalog;

import com.jeruiz.proyecto.productcatalog.domain.*;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        IProducto[] products = new IProducto[3];

        products[0] = new Phone(900,"Apple","Gray","14 PRO");
        products[1] = new TvLcd(1200,"Samsung",58);
        products[2] = new Comics(20,new Date(),"The amazing world", "Jader Ruiz", "Pepes.com","Pepin");

        for (IProducto p : products){
            System.out.println(p+"\n");
        }
    }

}
