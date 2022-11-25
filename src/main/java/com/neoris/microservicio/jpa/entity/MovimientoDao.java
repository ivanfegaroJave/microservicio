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
@Table(name = "movimiento")
public class MovimientoDao implements Serializable {

    @Id
    @Basic
    @NotNull
    @Column(name = "ID_MOVIMIENTO")
    private UUID id;



}
