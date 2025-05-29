package main.java.com.peliculasservice.repository;

import com.ejemplo.peliculasservice.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
    // Buscar por título de categoría (listedIn) que contenga un texto
    List<Pelicula> findByListedInContainingIgnoreCase(String listedIn);
}
