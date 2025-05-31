package com.peliculasservice.peliculasservice.repository;

import com.peliculasservice.peliculasservice.entity.TipoPelicula;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TipoPeliculaRepository extends JpaRepository <TipoPelicula, Long> {

    
}