package com.neoris.microservicio.entrypoint.controller;

import com.neoris.microservicio.crosscuting.constants.Constants;
import com.neoris.microservicio.crosscuting.constants.ResourceEndpoint;
import com.neoris.microservicio.jpa.entity.UsuarioDao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = Constants.CROSS_ORIGIN)
@RequestMapping(value = ResourceEndpoint.API)
public class CuentaController {

    //private final CuentaService cuentaService;

    @GetMapping(value = ResourceEndpoint.ACCOUNTS, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UsuarioDao> getAccounts( ) {
        return new ResponseEntity<>(new UsuarioDao(), HttpStatus.OK);
    }




}
