package com.recomendacionservice.recomendacionservice.repository;


import com.recomendacionservice.recomendacionservice.entity.historial_visualizacion;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HistorialVisualizacionRepository extends JpaRepository<historial_visualizacion, Long> {
    List<historial_visualizacion> findByUsuarioId(Long usuarioId);
    List<historial_visualizacion> findByPeliculaId(Long peliculaId);
    List<historial_visualizacion> findByUsuarioNombre(String nombre);

}