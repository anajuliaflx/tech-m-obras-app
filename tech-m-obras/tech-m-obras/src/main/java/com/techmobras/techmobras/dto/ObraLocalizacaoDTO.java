package com.techmobras.techmobras.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ObraLocalizacaoDTO {
    @NotBlank
    private String estado;

    @NotBlank
    private String cidade;

    @NotBlank
    private String longitude;

    @NotBlank
    private String latitude;

}
