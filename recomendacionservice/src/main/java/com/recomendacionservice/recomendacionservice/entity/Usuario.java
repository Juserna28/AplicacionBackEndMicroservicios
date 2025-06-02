package com.recomendacionservice.recomendacionservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")

public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    //Constructores
    public Usuario() {}

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
