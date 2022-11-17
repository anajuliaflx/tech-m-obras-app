package com.techmobras.techmobras.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.techmobras.techmobras.enums.FrequenciaInspecao;
import com.techmobras.techmobras.enums.StatusInspecao;

import java.util.Set;

@Entity
@Data
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
    private FrequenciaInspecao frequencia;
    private int mes;
    @Enumerated
    private StatusInspecao status;
    private int prioridade;

    @JsonIgnore
    @OneToMany(mappedBy = "obraInspecaoId", fetch = FetchType.LAZY)
    private Set<Inspecao> inspecoes;

}
