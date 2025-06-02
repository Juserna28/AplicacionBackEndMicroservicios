package com.recomendacionservice.recomendacionservice.repository;

import com.recomendacionservice.recomendacionservice.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
