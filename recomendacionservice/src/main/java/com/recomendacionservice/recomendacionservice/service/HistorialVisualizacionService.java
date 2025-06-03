package com.recomendacionservice.recomendacionservice.service;

import com.recomendacionservice.recomendacionservice.entity.historial_visualizacion;
import com.recomendacionservice.recomendacionservice.repository.HistorialVisualizacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialVisualizacionService {

    private final HistorialVisualizacionRepository historialRepository;
    

    public HistorialVisualizacionService(HistorialVisualizacionRepository historialRepository) {
        this.historialRepository = historialRepository;
    }

    public List<historial_visualizacion> obtenerTodo() {
        return historialRepository.findAll();
    }

    public Optional<historial_visualizacion> obtenerPorId(Long id) {
        return historialRepository.findById(id);
    }

    public List<historial_visualizacion> obtenerPorUsuarioId(Long usuarioId) {
        return historialRepository.findByUsuarioId(usuarioId);
    }

    public List<historial_visualizacion> obtenerPorUsuario(String nombre) {
    return historialRepository.findByUsuarioNombre(nombre);
    }

    public List<historial_visualizacion> obtenerPorPelicula(Long idPelicula) {
    return historialRepository.findByPeliculaId(idPelicula);
    }


    public historial_visualizacion guardar(historial_visualizacion historial) {
        return historialRepository.save(historial);
    }

    public void eliminar(Long id) {
        historialRepository.deleteById(id);
    }

}
