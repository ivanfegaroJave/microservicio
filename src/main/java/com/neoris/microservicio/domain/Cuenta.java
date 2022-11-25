package com.neoris.microservicio.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cuenta {

    private int numeroCuenta;
    private String tipoCuenta;
    private int saldoInicial;
    private String estado;

}
