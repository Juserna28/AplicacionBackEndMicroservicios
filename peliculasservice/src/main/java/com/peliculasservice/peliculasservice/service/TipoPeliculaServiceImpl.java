package com.peliculasservice.peliculasservice.service;

import com.peliculasservice.peliculasservice.entity.TipoPelicula;
import com.peliculasservice.peliculasservice.repository.TipoPeliculaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TipoPeliculaServiceImpl implements TipoPeliculaService{
    
    private final TipoPeliculaRepository tipoPeliculaRepository;

    public TipoPeliculaServiceImpl (TipoPeliculaRepository tipoPeliculaRepository) {
        this.tipoPeliculaRepository = tipoPeliculaRepository;
    }

    @Override
    public List <TipoPelicula> obtenerTodos() {
        return tipoPeliculaRepository.findAll();
    }

}
