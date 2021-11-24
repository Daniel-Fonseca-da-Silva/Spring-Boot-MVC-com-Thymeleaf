package com.project.springmvc.boot.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "FUNCIONARIOS")
@Getter
@Setter
public class Funcionario extends AbstractEntity<Long>{

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private BigDecimal salario;

    @Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
    private LocalDate dataEntrada;

    @Column(name = "data_saida", columnDefinition = "DATE")
    private LocalDate dataSaida;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id_fk")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "cargo_id_fk")
    private Cargo cargo;

}
