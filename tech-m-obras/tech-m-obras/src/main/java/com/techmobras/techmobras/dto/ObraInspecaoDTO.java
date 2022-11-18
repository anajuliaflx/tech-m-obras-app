package com.techmobras.techmobras.dto;

import javax.validation.constraints.NotBlank;

import com.techmobras.techmobras.enums.FrequenciaInspecao;
import com.techmobras.techmobras.enums.StatusInspecao;

import lombok.Data;

@Data
public class ObraInspecaoDTO {
    @NotBlank
    private FrequenciaInspecao frequencia;
    
    @NotBlank
    private int mes;

    @NotBlank
    private StatusInspecao status;

    @NotBlank
    private int prioridade;
    
}
