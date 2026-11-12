package com.jeruiz.proyecto.productcatalog.domain;

import java.util.Date;

public class Comics extends Libro{
    private String character;

    public Comics(int price, Date publicationDate, String title, String author, String editorial, String character) {
        super(price, publicationDate, title, author, editorial);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    @Override
    public double getSalePrice() {
        return 0;
    }
}
