package main.java.com.peliculasservice.repository;

import com.ejemplo.peliculasservice.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
   
}
