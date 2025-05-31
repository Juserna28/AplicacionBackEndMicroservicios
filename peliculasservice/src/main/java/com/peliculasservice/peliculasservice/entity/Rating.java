package com.peliculasservice.peliculasservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rating")

public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rating;

    private String rating;
}
