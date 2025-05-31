package com.peliculasservice.peliculasservice.service;

import com.peliculasservice.peliculasservice.entity.Pais;
import com.peliculasservice.peliculasservice.entity.Pelicula;
import com.peliculasservice.peliculasservice.entity.Rating;
import com.peliculasservice.peliculasservice.entity.TipoPelicula;
import com.peliculasservice.peliculasservice.repository.PaisRepository;
import com.peliculasservice.peliculasservice.repository.PeliculaRepository;
import com.peliculasservice.peliculasservice.repository.RatingRepository;
import com.peliculasservice.peliculasservice.repository.TipoPeliculaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaServiceImpl implements PeliculaService {
    
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Autowired
    private PaisRepository paisRepository;

    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private TipoPeliculaRepository tipoPeliculaRepository;

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
        // Cargar entidades pais
        if (pelicula.getPais() != null && pelicula.getPais().getId() != null) {
            Pais pais = paisRepository.findById(pelicula.getPais().getId())
                    .orElseThrow(() -> new RuntimeException("Pais no encontrado en la DB"));
            pelicula.setPais(pais);
        }
        // Cargar entidades rating
        if (pelicula.getRating() != null && pelicula.getRating().getId() != null) {
            Rating rating = ratingRepository.findById(pelicula.getRating().getId())
                    .orElseThrow(() -> new RuntimeException("Rating no encontrado en la DB"));
            pelicula.setRating(rating);
        }
        // Cargar entidades tipopliculka
        if (pelicula.getTipoPelicula() != null && pelicula.getTipoPelicula().getId() != null) {
            TipoPelicula tipo = tipoPeliculaRepository.findById(pelicula.getTipoPelicula().getId())
                    .orElseThrow(() -> new RuntimeException("Tipo de pelicula no encontrado en la DB"));
            pelicula.setTipoPelicula(tipo);
        }

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
    
    @Override
    public List<Pelicula> buscarPorTitulo(String titulo) {

    return peliculaRepository.findByTitulo(titulo);
    }

}
