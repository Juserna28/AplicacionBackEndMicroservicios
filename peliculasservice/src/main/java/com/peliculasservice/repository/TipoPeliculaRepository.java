package main.java.com.peliculasservice.repository;

import com.ejemplo.peliculasservice.entity.TipoPelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoPeliculaRepository extends JpaRepository<TipoPelicula, Long> {
}
