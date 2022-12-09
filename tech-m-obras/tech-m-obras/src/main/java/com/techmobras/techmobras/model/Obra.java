package com.techmobras.techmobras.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.math.BigInteger;

@Entity
@Getter
@Setter
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
    @Column(length = 45)
    private BigInteger anoConstrucao;

    @NotBlank
    @Column(length = 45)
    private String coordenacao;

    @NotNull
    @Column(length = 45)
    private String gerencia;

    @NotNull
    @Column(length = 45)
    private String diretoria;

    @NotBlank
    @Column(length = 45)
    private String outorga;

    @NotBlank
    @Column(length = 45)
    private String titularidade;

    @OneToOne(mappedBy = "obraId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ObraLocalizacao obraLocalizacao;
    @OneToOne(mappedBy = "obraId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ObraDetalhesTecnicos obraDetalhesTecnicos;
    @OneToOne(mappedBy = "obraId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ObraInspecao obraInspecao;
    public Obra(Integer id) {
        this.id = id;
    }
}