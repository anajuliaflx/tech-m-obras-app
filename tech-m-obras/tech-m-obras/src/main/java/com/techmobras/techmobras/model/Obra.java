package com.techmobras.techmobras.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Obra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 45)
    private String nome;

    @Column(nullable = false)
    private BigInteger anoConstrucao;

    @Column(nullable = false, length = 45)
    private String coordenacao;

    @Column(nullable = false, length = 45)
    private String gerencia;

    @Column(nullable = false, length = 45)
    private String diretoria;

    @Column(nullable = false, length = 45)
    private String outorga;

    @Column(nullable = false, length = 45)
    private String titularidade;

}