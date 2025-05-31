package com.peliculasservice.peliculasservice.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "peliculas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPelicula;
    private String titulo;
    private String director;
    private String estrellas;
    private LocalDate fecha_estreno;
    private Integer año;
    private String duracion;
    private String categorias;
    private String descripcion;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pais")
    private Pais pais;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_rating")
    private Rating rating;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipo")
    private TipoPelicula tipoPelicula;

}
