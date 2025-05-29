package com.peliculasservice.entity;

import java.time.LocalDate;

@Entity
@Table(name = "peliculas")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateAdded;
    private Integer releaseYear;
    private String duration;
    private String listenIn;
    private String description;

    //Relaciones
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
