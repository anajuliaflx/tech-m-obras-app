package com.techmobras.techmobras.model;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.techmobras.techmobras.enums.ObraRisco;
import com.techmobras.techmobras.enums.ObraTipo;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ObraDetalhesTecnicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "obra_id", referencedColumnName = "id")
    private Obra obraId;

    @Enumerated
    @NotNull
    @Column(length = 45)
    private ObraTipo tipo;

    @Enumerated
    @NotNull
    @Column(length = 45)
    private ObraRisco risco;

}
