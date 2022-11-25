package com.neoris.microservicio.jpa.repository;

import com.neoris.microservicio.jpa.entity.UsuarioDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<UsuarioDao, UUID> {

    Optional<UsuarioDao> findByIdUser (Long id);

}
