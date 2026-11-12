package com.jeruiz.proyecto.productcatalog.domain;

import java.util.Date;

public interface ILibro {
    Date getPublicationDate();
    String getAuthor();
    String getTitle();
    String getEditorial();
}
