package com.techmobras.techmobras.dto;

import javax.validation.constraints.NotBlank;

import com.techmobras.techmobras.enums.FrequenciaInspecao;
import com.techmobras.techmobras.enums.StatusInspecao;
import com.techmobras.techmobras.model.Inspecao;
import com.techmobras.techmobras.model.Obra;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ObraInspecaoDTO {
    @NotBlank
    @Getter @Setter private FrequenciaInspecao frequencia;

    @NotBlank
    @Getter @Setter private Obra obraId;

    @NotBlank
    @Getter @Setter private int mes;

    @NotBlank
    @Getter @Setter private StatusInspecao status;

    @NotBlank
    @Getter @Setter private int prioridade;

    @NotBlank
    @Getter @Setter private Inspecao inspecao;
    
}
