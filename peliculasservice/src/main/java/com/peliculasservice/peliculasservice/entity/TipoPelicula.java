package com.peliculasservice.peliculasservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tipo_pelicula")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoPelicula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo;

    private String tipo;
}
