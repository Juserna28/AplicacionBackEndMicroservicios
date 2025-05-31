package com.peliculasservice.peliculasservice.controller;

import com.peliculasservice.peliculasservice.entity.Rating;
import com.peliculasservice.peliculasservice.service.RatingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/rating")
public class RatingController {

    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping
    public List<Rating> listarRatings() {
        return ratingService.obtenerTodos();
    }
}
