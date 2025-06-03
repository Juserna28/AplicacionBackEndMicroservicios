package com.recomendacionservice.recomendacionservice.controller;

import com.recomendacionservice.recomendacionservice.entity.historial_visualizacion;
import com.recomendacionservice.recomendacionservice.service.HistorialVisualizacionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/historial")

public class HistorialVisualizacionController {
    private final HistorialVisualizacionService historialService;

    public HistorialVisualizacionController(HistorialVisualizacionService historialService) {
        this.historialService = historialService;
    }

    // Obtener todo el historial
    @GetMapping
    public List<historial_visualizacion> listarTodo() {
        return historialService.obtenerTodo();
    }

    // Buscar historial por ID
    @GetMapping("/{id}")
    public ResponseEntity<historial_visualizacion> obtenerPorId(@PathVariable Long id) {
        Optional<historial_visualizacion> historial = historialService.obtenerPorId(id);
        return historial.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Buscar por usuario (nombre)
    @GetMapping("/usuario")
    public List<historial_visualizacion> obtenerPorUsuario(@RequestParam String nombre) {
        return historialService.obtenerPorUsuario(nombre);
    }

    // Buscar por id película
    @GetMapping("/pelicula")
    public List<historial_visualizacion> obtenerPorPelicula(@RequestParam Long id) {
        return historialService.obtenerPorPelicula(id);
    }

    // Crear un registro en el historial
    @PostMapping
    public ResponseEntity<historial_visualizacion> guardar(@RequestBody historial_visualizacion historial) {
        historial_visualizacion guardado = historialService.guardar(historial);
        return ResponseEntity.ok(guardado);
    }

    // Actualizar historial por ID
    @PutMapping("/{id}")
    public ResponseEntity<historial_visualizacion> actualizar(@PathVariable Long id,
            @RequestBody historial_visualizacion historial) {
        Optional<historial_visualizacion> existente = historialService.obtenerPorId(id);
        if (existente.isPresent()) {
            historial.setId(id);
            historial_visualizacion actualizado = historialService.guardar(historial);
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar historial por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        Optional<historial_visualizacion> existente = historialService.obtenerPorId(id);
        if (existente.isPresent()) {
            historialService.eliminar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
