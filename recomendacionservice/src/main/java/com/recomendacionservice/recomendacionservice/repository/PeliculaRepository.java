package com.recomendacionservice.recomendacionservice.repository;

import com.recomendacionservice.recomendacionservice.entity.Pelicula;
import com.recomendacionservice.recomendacionservice.entity.TipoPelicula;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
    List<Pelicula> findByTitulo(String titulo);
    List<Pelicula> findByTipoPeliculaAndIdNotIn(TipoPelicula tipo, Collection<Long> ids);
}