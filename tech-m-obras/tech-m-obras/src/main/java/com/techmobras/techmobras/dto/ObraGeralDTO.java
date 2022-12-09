package com.techmobras.techmobras.dto;

import java.math.BigInteger;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.techmobras.techmobras.model.ObraDetalhesTecnicos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ObraGeralDTO {
    @NotBlank
    private String nome;

    @NotNull
    private BigInteger anoConstrucao;

    @NotBlank
    private String coordenacao;

    @NotBlank
    private String gerencia;

    @NotBlank
    private String diretoria;

    @NotBlank
    private String outorga;

    @NotBlank
    private String titularidade;

    @NotNull
    private ObraDetalhesTecnicos obraDetalhesTecnicos;

    @NotNull
    private ObraLocalizacaoDTO obraLocalizacao;

    @NotNull
    private List<ObraInspecaoDTO> obraInspecao;

}
