package com.peliculasservice.peliculasservice.controller;

import com.peliculasservice.peliculasservice.entity.TipoPelicula;
import com.peliculasservice.peliculasservice.service.TipoPeliculaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/tipopelicula")
public class TipoPeliculaController {
    
    private final TipoPeliculaService tipoPeliculaService;

    public TipoPeliculaController (TipoPeliculaService tipoPeliculaService)
    {
        this.tipoPeliculaService = tipoPeliculaService;
    }
    
    @GetMapping
    public List <TipoPelicula> listarTipoPeliculas() {
        return tipoPeliculaService.obtenerTodos();
    }
}
