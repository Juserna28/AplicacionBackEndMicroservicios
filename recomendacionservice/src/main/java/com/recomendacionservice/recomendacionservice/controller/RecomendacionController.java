package com.recomendacionservice.recomendacionservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.recomendacionservice.recomendacionservice.entity.Pelicula;
import com.recomendacionservice.recomendacionservice.service.RecomendacionService;

@RestController
@RequestMapping("/api/recomendaciones")
public class RecomendacionController {
    
    private final RecomendacionService recomendacionService;

    public RecomendacionController(RecomendacionService recomendacionService) {
        this.recomendacionService = recomendacionService;
    }

    @GetMapping
    public ResponseEntity<List<Pelicula>> recomendar(@RequestParam String usuario) {
        List<Pelicula> recomendaciones = recomendacionService.recomendarPorUsuario(usuario);
        return ResponseEntity.ok(recomendaciones);
    }

}
