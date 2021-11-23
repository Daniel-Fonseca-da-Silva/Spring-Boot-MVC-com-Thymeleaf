package com.project.springmvc.boot.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    @Getter @Setter
    private String nome;

    @OneToMany(mappedBy = "departamentos")
    @Getter @Setter
    private List<Cargo> cargos;

}
