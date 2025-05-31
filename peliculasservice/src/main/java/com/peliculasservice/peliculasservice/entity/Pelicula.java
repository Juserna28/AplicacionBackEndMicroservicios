package com.peliculasservice.peliculasservice.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date_added;
    private Integer release_year;
    private String duration;
    private String listed_in;
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;

    @ManyToOne
    @JoinColumn(name = "id_rating")
    private Rating rating;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private TipoPelicula tipoPelicula;

}
