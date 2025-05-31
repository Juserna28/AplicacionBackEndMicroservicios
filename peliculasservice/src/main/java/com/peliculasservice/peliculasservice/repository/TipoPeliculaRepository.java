package com.peliculasservice.peliculasservice.repository;

import com.peliculasservice.peliculasservice.entity.Rating;
import com.peliculasservice.peliculasservice.entity.TipoPelicula;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TipoPeliculaRepository extends JpaRepository <TipoPelicula, Long> {

    
}