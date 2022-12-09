package com.techmobras.techmobras.dto;

import java.math.BigInteger;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ObraDTO {
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

}
