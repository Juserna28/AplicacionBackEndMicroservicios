package com.recomendacionservice.recomendacionservice.controller;

import com.recomendacionservice.recomendacionservice.entity.Pelicula;
import com.recomendacionservice.recomendacionservice.service.PeliculaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/peliculas")

public class PeliculaController {
    
    private final PeliculaService peliculaService;

    public PeliculaController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    //Obtener todas las películas
    @GetMapping
    public List<Pelicula> listarTodas() {
        return peliculaService.obtenerTodas();
    }

    //Buscar película por ID
    @GetMapping("/{id}")
    public ResponseEntity<Pelicula> obtenerPorId(@PathVariable Long id) {
        Optional<Pelicula> pelicula = peliculaService.obtenerPorId(id);
        return pelicula.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Buscar por título
    @GetMapping("/titulo")
    public List<Pelicula> obtenerPorTitulo(@RequestParam String nombre) {
    return peliculaService.buscarPorTitulo(nombre);
}

    //Crear película
    @PostMapping
    public ResponseEntity<Pelicula> crear(@RequestBody Pelicula pelicula) {
        Pelicula creada = peliculaService.guardar(pelicula);
        return ResponseEntity.status(201).body(creada);
    }

    // Actualizar película
    @PutMapping("/{id}")
    public ResponseEntity<Pelicula> actualizar(@PathVariable Long id, @RequestBody Pelicula pelicula) {
        Optional<Pelicula> existente = peliculaService.obtenerPorId(id);
        if (existente.isPresent()) {
            pelicula.setId(id);
            Pelicula actualizada = peliculaService.guardar(pelicula);
            return ResponseEntity.ok(actualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //Eliminar película
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        Optional<Pelicula> existente = peliculaService.obtenerPorId(id);
        if (existente.isPresent()) {
            peliculaService.eliminar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
