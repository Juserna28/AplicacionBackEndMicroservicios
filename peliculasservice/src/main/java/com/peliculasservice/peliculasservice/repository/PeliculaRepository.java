package com.peliculasservice.peliculasservice.repository;

import com.peliculasservice.peliculasservice.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PeliculaRepository extends JpaRepository <Pelicula, Long>  {

    List <Pelicula> findByTitulo(String titulo);

    
}