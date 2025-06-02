package com.recomendacionservice.recomendacionservice.service;

import com.recomendacionservice.recomendacionservice.entity.Pelicula;
import com.recomendacionservice.recomendacionservice.repository.PeliculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaService {

    private final PeliculaRepository peliculaRepository;

    public PeliculaService(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    public List<Pelicula> obtenerTodas() {
        return peliculaRepository.findAll();
    }

    public Optional<Pelicula> obtenerPorId(Long id) {
        return peliculaRepository.findById(id);
    }

    public List<Pelicula> buscarPorTitulo(String titulo) {
        return peliculaRepository.findByTitulo(titulo);
    }

    public Pelicula guardar(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    public void eliminar(Long id) {
        peliculaRepository.deleteById(id);
    }
}