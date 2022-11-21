package com.techmobras.techmobras.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.math.BigInteger;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Obra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Column(length = 45)
    private String nome;

    @NotNull
    private BigInteger anoConstrucao;

    @NotBlank
    @Column(length = 45)
    private String coordenacao;

    @NotBlank
    @Column(length = 45)
    private String gerencia;

    @NotBlank
    @Column(length = 45)
    private String diretoria;

    @NotBlank
    @Column(length = 45)
    private String outorga;

    @NotBlank
    @Column(length = 45)
    private String titularidade;

}