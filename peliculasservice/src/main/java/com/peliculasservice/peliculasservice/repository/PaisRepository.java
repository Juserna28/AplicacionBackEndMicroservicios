package com.peliculasservice.peliculasservice.repository;

import com.peliculasservice.peliculasservice.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaisRepository extends JpaRepository <Pais, Long> {

    
}