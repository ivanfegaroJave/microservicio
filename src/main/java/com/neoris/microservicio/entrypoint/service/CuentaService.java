package com.neoris.microservicio.entrypoint.service;

import com.neoris.microservicio.domain.Cuenta;
import com.neoris.microservicio.jpa.entity.CuentaDao;
import org.springframework.http.ResponseEntity;

public interface CuentaService {

    ResponseEntity<CuentaDao> createAccount(Long id,Cuenta cuenta);

    ResponseEntity<CuentaDao> updateAccount(Long id,  Cuenta cuenta);

    ResponseEntity<CuentaDao> deleteAccount(int number);



}
