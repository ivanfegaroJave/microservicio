package com.neoris.microservicio.jpa.entity;

import com.sun.istack.NotNull;
import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Basic;
import javax.persistence.Column;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "cuenta")
public class CuentaDao implements Serializable {

    @Id
    @Basic
    @NotNull
    @Column(name = "ID_CUENTA")
    private UUID id;

    @Column(name = "NUMERO_CUENTA")
    private int accountNumber;

    @Column(name = "TIPO_CUENTA")
    private String type;

    @Column(name = "SALDO")
    private int balance;

    @Column(name = "ESTADO")
    private String status;



}
