package com.jeruiz.proyecto.productcatalog.domain;

import java.util.Date;

abstract class Libro extends Producto implements ILibro{
    protected Date publicationDate;
    protected String title;
    protected String author;
    protected String editorial;

    public Libro(int price,Date publicationDate,String title,String author, String editorial){
        super(price);
        this.publicationDate = publicationDate;
        this.title = title;
        this.author = author;
        this.editorial = editorial;
    }

    @Override
    public Date getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString(){
        return super.toString() + "\nTitle: " + title + ", Author: " + author
                + ", Editorial: " + editorial + ", Publication Date: " + publicationDate;
    }
}
