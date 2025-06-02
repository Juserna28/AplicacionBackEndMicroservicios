package com.recomendacionservice.recomendacionservice.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "peliculas")

public class Pelicula {

    @Id
    @Column(name = "id_pelicula")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "director")
    private String director;

    @Column(name = "estrellas", columnDefinition = "TEXT")
    private String estrellas;

    @Column(name = "id_pais")
    private Long idPais;

    @Column(name = "fecha_estreno")
    private LocalDate fechaEstreno;

    @Column(name = "año")
    private Integer anio;

    @Column(name = "id_rating")
    private Long idRating;

    @Column(name = "duracion")
    private String duracion;

    @Column(name = "categorias")
    private String categorias;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "id_tipo")
    private Long idTipo;


    // Relación con historial
    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<historial_visualizacion> historial;

    // Constructores
    public Pelicula() {
    }

    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }


    public List<historial_visualizacion> getHistorial() {
        return historial;
    }

    public void setHistorial(List<historial_visualizacion> historial) {
        this.historial = historial;
    }
}
