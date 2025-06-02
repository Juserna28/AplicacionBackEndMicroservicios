package com.recomendacionservice.recomendacionservice.repository;

import com.recomendacionservice.recomendacionservice.entity.Pelicula;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
    List<Pelicula> findByTitulo(String titulo);
}