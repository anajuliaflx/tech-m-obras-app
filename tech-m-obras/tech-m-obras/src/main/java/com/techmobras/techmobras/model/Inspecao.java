package com.techmobras.techmobras.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inspecao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "obra_inspecao_id", referencedColumnName = "id")
    private ObraInspecao obraInspecaoId;

    @NotNull
    @Column
    private Date data;

    @NotBlank
    @Column
    private String observacoes;

}
