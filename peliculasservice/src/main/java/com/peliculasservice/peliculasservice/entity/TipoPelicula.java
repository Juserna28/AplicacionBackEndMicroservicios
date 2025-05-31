package com.peliculasservice.peliculasservice.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "tipo_pelicula")

public class TipoPelicula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo;

    private String tipo_pelicula;
}
