package com.techmobras.techmobras.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import com.techmobras.techmobras.model.ObraInspecao;

import lombok.Data;

@Data
public class InspecaoDTO { 

    @NotBlank
    private Integer id;
    @NotBlank
    private ObraInspecao obraInspecaoId;
    @NotBlank
    private Date data;
    @NotBlank
    private String observacoes;
    
}
