package com.recomendacionservice.recomendacionservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "historial_visualizacion")

public class historial_visualizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "pelicula_id", referencedColumnName = "id_pelicula")
    @JsonIgnoreProperties({"anio"})
    private Pelicula pelicula;

    @Column(name = "fecha_visto")
    private LocalDateTime fechaVisto;

    // --- Constructores ---
    public historial_visualizacion() {}

    // --- Getters y Setters ---
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDateTime getFechaVisto() {
        return fechaVisto;
    }

    public void setFechaVisto(LocalDateTime fechaVisto) {
        this.fechaVisto = fechaVisto;
    }
}
