package com.techmobras.techmobras.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.techmobras.techmobras.enums.FrequenciaInspecao;
import com.techmobras.techmobras.enums.StatusInspecao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ObraInspecaoDTO {
    @NotNull
    private FrequenciaInspecao frequencia;

    @NotNull
    private int mes;

    @NotNull
    private StatusInspecao status;

    @NotNull
    private int prioridade;

    private List<InspecaoDTO> inspecoes;

}
