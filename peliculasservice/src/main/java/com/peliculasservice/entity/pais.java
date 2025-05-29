package com.peliculasservice.entity;

import javax.annotation.processing.Generated;

import jakarta.persistence.*;
import lombok.*;

@entity
@Table(name = "paises")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class pais {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPais;
    private String pais;
}
