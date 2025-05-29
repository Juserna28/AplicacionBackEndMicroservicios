package com.peliculasservice.entity;

import java.time.LocalDate;

public class pelicula {
    private Long id;
    private LocalDate dateAdded;
    private Integer releaseYear;
    private String duration;
    private String listenIn;
    private String description;

    //Relaciones
    private Pais pais;
    private Rating rating;
    private TipoPelicula tipoPelicula;


}
