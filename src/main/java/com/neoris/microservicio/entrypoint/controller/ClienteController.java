package com.neoris.microservicio.entrypoint.controller;

import com.neoris.microservicio.crosscuting.constants.Constants;
import com.neoris.microservicio.crosscuting.constants.ResourceEndpoint;
import com.neoris.microservicio.crosscuting.exception.ValidationException;
import com.neoris.microservicio.domain.Cliente;
import com.neoris.microservicio.entrypoint.service.ClienteService;
import com.neoris.microservicio.jpa.entity.UsuarioDao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = Constants.CROSS_ORIGIN)
@RequestMapping(value = ResourceEndpoint.API)
public class ClienteController {


    private final ClienteService clienteService;

    @GetMapping(value = ResourceEndpoint.USERS, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <UsuarioDao> getUsers( ) {
        return new ResponseEntity<>(clienteService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping(value = ResourceEndpoint.CREATE_USER,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <UsuarioDao> createClient(@RequestBody Cliente cliente ) {
        if (cliente == null) {
            throw new ValidationException(Constants.NOT_VALID);
        } else {
            return clienteService.createClient(cliente);
        }

    }

    @PostMapping(value = ResourceEndpoint.UPDATE_USER,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <UsuarioDao> updateClient(@PathVariable(Constants.ID) Long id ,
                                                    @RequestBody  Cliente cliente ) {
        if (cliente == null) {
            throw new ValidationException(Constants.NOT_VALID);
        } else {
            return clienteService.updateClient(id, cliente);
        }

    }

    @DeleteMapping(value = ResourceEndpoint.DELETE_USER,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <UsuarioDao> deleteClient(@PathVariable(Constants.ID) Long id) {
        if (id == null) {
            throw new ValidationException(Constants.NOT_VALID);
        } else {
            return clienteService.deleteClient(id);
        }

    }



}
