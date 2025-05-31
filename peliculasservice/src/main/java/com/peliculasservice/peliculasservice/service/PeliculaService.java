package com.peliculasservice.peliculasservice.service;

import java.util.List;
import java.util.Optional;

import com.peliculasservice.peliculasservice.entity.Pelicula;


public interface PeliculaService {

    List<Pelicula> obtenerTodas();
    List<Pelicula> buscarPorTitulo(String titulo);
    Optional<Pelicula> obtenerPorId(Long id);
    Pelicula guardar(Pelicula pelicula);
    Pelicula actualizar(Long id, Pelicula pelicula);
    void eliminar(Long id);
    
}