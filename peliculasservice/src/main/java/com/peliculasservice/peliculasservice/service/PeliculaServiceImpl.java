package com.peliculasservice.peliculasservice.service;

import com.peliculasservice.peliculasservice.entity.Pelicula;
import com.peliculasservice.peliculasservice.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PeliculaServiceImpl implements PeliculaService {
    
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> obtenerTodas() {
        return peliculaRepository.findAll();
    }

    @Override
    public Optional<Pelicula> obtenerPorId(Long id) {
        return peliculaRepository.findById(id);
    }

    @Override
    public Pelicula guardar(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    @Override
    public Pelicula actualizar(Long id, Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    @Override
    public void eliminar(Long id) {
        peliculaRepository.deleteById(id);
    }
    
}
