package com.peliculasservice.peliculasservice.controller;

import com.peliculasservice.peliculasservice.entity.Pais;
import com.peliculasservice.peliculasservice.service.PaisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/pais")
public class PaisController {

    private final PaisService paisService;

    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    @GetMapping
    public List<Pais> listarPaises() {
        return paisService.obtenerTodos();
    }
}
