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
    @Column(name = "id_tipo")
    private Long id_tipo;

    @Column(name = "tipo")
    private String tipo;


    // Getter y Setter del ID
    public Long getId() {
        return id_tipo;
    }

    public void setId(Long id_tipo) {
        this.id_tipo = id_tipo;
    }

    // Getter y Setter del nombre
    public String getNombre() {
        return tipo;
    }

    public void setNombre(String tipo) {
        this.tipo = tipo;
    }

}
