package com.project.springmvc.boot.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "CARGOS")
public class Cargo {

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    @Getter @Setter
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    @Getter @Setter private Departamento departamento;

}
