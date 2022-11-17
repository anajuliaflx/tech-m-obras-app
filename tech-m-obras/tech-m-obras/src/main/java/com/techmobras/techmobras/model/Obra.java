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
    private String nome;
    private BigInteger anoConstrucao;
    private String coordenacao;
    private String gerencia;
    private String diretoria;
    private String outorga;
    private String titularidade;

}