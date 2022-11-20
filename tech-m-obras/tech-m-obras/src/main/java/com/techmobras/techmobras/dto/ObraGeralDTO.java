package com.techmobras.techmobras.dto;

import java.math.BigInteger;
import java.util.List;

import javax.validation.constraints.NotBlank;

import com.techmobras.techmobras.model.ObraDetalhesTecnicos;
import com.techmobras.techmobras.model.ObraLocalizacao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ObraGeralDTO {
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

    @NotBlank
    @Getter @Setter private ObraDetalhesTecnicos obraDetalhesTecnicos;

    @NotBlank
    @Getter @Setter private ObraLocalizacao obraLocalizacao;

    @NotBlank
    @Getter @Setter private List<ObraInspecaoDTO> obraInspecao;
    
}
