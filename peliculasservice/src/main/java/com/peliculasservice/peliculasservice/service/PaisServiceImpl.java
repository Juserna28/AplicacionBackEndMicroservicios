package com.peliculasservice.peliculasservice.service;

import com.peliculasservice.peliculasservice.entity.Pais;
import com.peliculasservice.peliculasservice.repository.PaisRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {

    private final PaisRepository paisRepository;

    public PaisServiceImpl(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    @Override
    public List<Pais> obtenerTodos() {
        return paisRepository.findAll();
    }
}
