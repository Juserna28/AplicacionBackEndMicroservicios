package com.peliculasservice.entity;

import jakarta.persistence.*;
import lombok.*;

@entity
@Table(name = "tipo_pelicula")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class tipopelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idTipo;
    private String tipoPelicula;
    
}
