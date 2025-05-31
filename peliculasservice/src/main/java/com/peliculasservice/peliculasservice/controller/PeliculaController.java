package com.peliculasservice.peliculasservice.controller;

import com.peliculasservice.peliculasservice.entity.Pelicula;
import com.peliculasservice.peliculasservice.service.PeliculaService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {
    
    @Autowired
    private PeliculaService peliculaService;

    // Obtener todas las películas
    @GetMapping
    public List<Pelicula> obtenerTodas() {
        return peliculaService.obtenerTodas();
    }

    // Obtener película por ID
    @GetMapping("/{id}")
    public ResponseEntity<Pelicula> obtenerPorId(@PathVariable Long id) {
        Optional<Pelicula> pelicula = peliculaService.obtenerPorId(id);
        return pelicula.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // Crear nueva película
    @PostMapping
    public ResponseEntity<Pelicula> crear(@RequestBody Pelicula pelicula) {
        Pelicula nueva = peliculaService.guardar(pelicula);
        return ResponseEntity.ok(nueva);
    }

    // Actualizar película existente
    @PutMapping("/{id}")
    public ResponseEntity<Pelicula> actualizar(@PathVariable Long id, @RequestBody Pelicula pelicula) {
        Pelicula actualizada = peliculaService.actualizar(id, pelicula);
        if (actualizada != null) {
            return ResponseEntity.ok(actualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar película
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        peliculaService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
      // Buscar pelícla por titulo
    @GetMapping("/buscar")
    public List<Pelicula> buscarPorTitulo(@RequestParam String titulo) {
    return peliculaService.buscarPorTitulo(titulo);
    }

}
