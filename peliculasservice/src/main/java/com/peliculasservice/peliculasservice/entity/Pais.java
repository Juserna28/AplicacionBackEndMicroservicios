package com.peliculasservice.peliculasservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "paises")

public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pais;

    private String pais;
}
