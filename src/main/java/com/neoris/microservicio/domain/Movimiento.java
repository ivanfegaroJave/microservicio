package com.neoris.microservicio.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movimiento {

    private String tipoMovimiento;
    private String valor;
    private String saldo;
    private String fecha;

}
