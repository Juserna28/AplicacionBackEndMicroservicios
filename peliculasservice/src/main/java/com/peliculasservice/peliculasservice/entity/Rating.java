package com.peliculasservice.peliculasservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rating")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id_rating")
    private Long id_rating;

    @Column(name = "rating")
    private String rating;

    // Getter y Setter del ID
    public Long getId() {
        return id_rating;
    }

    public void setId(Long id_rating) {
        this.id_rating = id_rating;
    }

    // Getter y Setter del nombre
    public String getNombre() {
        return rating;
    }

    public void setNombre(String rating) {
        this.rating = rating;
    }
}
