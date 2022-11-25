package com.neoris.microservicio.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Cliente extends Persona{

    private String contrasena;
    private boolean estado;

}
