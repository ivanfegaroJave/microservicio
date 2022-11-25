package com.neoris.microservicio.jpa.repository;

import com.neoris.microservicio.jpa.entity.CuentaDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CuentaRepository extends JpaRepository <CuentaDao, UUID> {
}
