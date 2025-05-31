package com.peliculasservice.peliculasservice.repository;

import com.peliculasservice.peliculasservice.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository <Rating, Long> {

    
}
