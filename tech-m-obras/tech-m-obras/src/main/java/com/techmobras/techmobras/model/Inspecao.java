package com.techmobras.techmobras.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inspecao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "obra_inspecao_id", referencedColumnName="id")
    private ObraInspecao obraInspecaoId;

    @NotBlank
    @Column
    private LocalDate data;

    @NotBlank
    @Column
    private String observacoes;

}
