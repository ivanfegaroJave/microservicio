package com.neoris.microservicio.jpa.entity;


import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Basic;
import javax.persistence.Column;
import java.util.UUID;
import java.io.Serializable;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "usuario")
public class UsuarioDao implements Serializable {

    private static final long serialVersionUID = 3215833037118051878L;

    public UsuarioDao(){

    }

    @Id
    @Basic
    @NotNull
    @Column(name = "ID_USUARIO")
    private UUID id;

    @Column(name = "NOMBRES")
    private String names;

    @Column(name = "DIRECCION")
    private String address;

    @Column(name = "TELEFONO")
    private int number;

    @Column(name = "CONTRASENA")
    private String password;

    @Column(name = "ESTADO")
    private String status;

    @Column(name = "IDENTIFICACION")
    private String idUser;

    @Column(name = "EDAD")
    private String age;



}
