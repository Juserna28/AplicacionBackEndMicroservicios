package com.peliculasservice.entity;

import jakarta.persistence.*;
import lombok.*;

@entity
@Table(name = "rating")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idRating;
    private String rating;
}
