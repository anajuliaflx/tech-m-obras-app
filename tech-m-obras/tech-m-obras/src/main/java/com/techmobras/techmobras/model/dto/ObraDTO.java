package com.techmobras.techmobras.dto;

import java.math.BigInteger;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ObraDTO {
    @NotBlank
    @Getter @Setter private String nome;

    @NotBlank
    @Getter @Setter private BigInteger anoConstrucao;

    @NotBlank
    @Getter @Setter private String coordenacao;

    @NotBlank
    @Getter @Setter private String gerencia;

    @NotBlank
    @Getter @Setter private String diretoria;

    @NotBlank
    @Getter @Setter private String outorga;
    
    @NotBlank
    @Getter @Setter private String titularidade;
    
}