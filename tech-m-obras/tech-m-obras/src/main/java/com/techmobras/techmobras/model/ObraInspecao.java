package com.techmobras.techmobras.model;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.techmobras.techmobras.enums.FrequenciaInspecao;
import com.techmobras.techmobras.enums.StatusInspecao;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ObraInspecao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "obra_id", referencedColumnName="id")
    private Obra obraId;

    @Enumerated
    @NotNull
    @Column(length = 45)
    private FrequenciaInspecao frequencia;

    @NotNull
    @Column
    private int mes;

    @NotNull
    @Enumerated
    @Column(length = 45)
    private StatusInspecao status;

    @NotNull
    @Column
    private int prioridade;

    @JsonIgnore
    @OneToMany(mappedBy = "obraInspecaoId", fetch = FetchType.LAZY)
    private Set<Inspecao> inspecoes;

}
