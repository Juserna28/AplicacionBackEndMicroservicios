package com.recomendacionservice.recomendacionservice.service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.recomendacionservice.recomendacionservice.entity.Pelicula;
import com.recomendacionservice.recomendacionservice.entity.TipoPelicula;
import com.recomendacionservice.recomendacionservice.entity.historial_visualizacion;
import com.recomendacionservice.recomendacionservice.repository.HistorialVisualizacionRepository;
import com.recomendacionservice.recomendacionservice.repository.PeliculaRepository;

@Service
public class RecomendacionService {

    private final HistorialVisualizacionRepository historialRepository;
    private final PeliculaRepository peliculaRepository;

    public RecomendacionService(
            HistorialVisualizacionRepository historialRepository,
            PeliculaRepository peliculaRepository) {
        this.historialRepository = historialRepository;
        this.peliculaRepository = peliculaRepository;
    }

    public List<Pelicula> recomendarPorUsuario(String nombreUsuario) {
        List<historial_visualizacion> historial = historialRepository.findByUsuarioNombre(nombreUsuario);

        if (historial.isEmpty())
            return Collections.emptyList();

        Map<TipoPelicula, Long> frecuencia = historial.stream()
                .map(h -> {
                    Pelicula p = h.getPelicula();
                    return (p != null) ? p.getTipoPelicula() : null;
                })
                .filter(tp -> tp != null)
                .collect(Collectors.groupingBy(tp -> tp, Collectors.counting()));

        TipoPelicula tipoMasVisto = frecuencia.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        if (tipoMasVisto == null)
            return Collections.emptyList();

        Set<Long> vistas = historial.stream()
                .map(h -> h.getPelicula().getId())
                .collect(Collectors.toSet());

        return peliculaRepository.findByTipoPeliculaAndIdNotIn(tipoMasVisto, vistas);
    }
}
