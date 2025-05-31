package com.peliculasservice.peliculasservice.service;

import com.peliculasservice.peliculasservice.entity.Rating;
import com.peliculasservice.peliculasservice.repository.RatingRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RatingServiceImp implements RatingService{
    
    private final RatingRepository ratingRepository;

    public RatingServiceImp(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @Override
    public List<Rating> obtenerTodos() {
        return ratingRepository.findAll();
    }
}
