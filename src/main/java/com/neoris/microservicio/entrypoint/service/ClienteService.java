package com.neoris.microservicio.entrypoint.service;

import com.neoris.microservicio.domain.Cliente;
import com.neoris.microservicio.jpa.entity.UsuarioDao;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ClienteService {

    UsuarioDao getAllUsers();

    ResponseEntity<UsuarioDao> createClient(Cliente cliente);

    ResponseEntity<UsuarioDao> updateClient(Long id, Cliente cliente);

    ResponseEntity<UsuarioDao> deleteClient(Long identificacion);
}
