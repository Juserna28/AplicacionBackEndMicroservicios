package com.peliculasservice.peliculasservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pais")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_pais")
    private Long id_pais;

    @Column(name = "pais")
    private String pais;


    // Getter y Setter del ID
    public Long getId() {
        return id_pais;
    }

    public void setId(Long id_pais) {
        this.id_pais = id_pais;
    }

    // Getter y Setter del nombre
    public String getNombre() {
        return pais;
    }

    public void setNombre(String pais) {
        this.pais = pais;
    }

}
