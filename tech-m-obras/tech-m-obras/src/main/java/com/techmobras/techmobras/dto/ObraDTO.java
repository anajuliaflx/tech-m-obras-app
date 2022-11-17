package com.techmobras.techmobras.dto;

import java.math.BigInteger;

import lombok.Data;
@Data
public class ObraDTO {
    private String nome;
    private BigInteger anoConstrucao;
    private String coordenacao;
    private String gerencia;
    private String diretoria;
    private String outorga;
    private String titularidade;

    
}
