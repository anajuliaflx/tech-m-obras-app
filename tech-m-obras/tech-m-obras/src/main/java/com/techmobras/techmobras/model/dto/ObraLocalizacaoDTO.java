package com.techmobras.techmobras.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ObraLocalizacaoDTO {
    @NotBlank
    @Getter @Setter private String estado;

    @NotBlank
    @Getter @Setter private String cidade;

    @NotBlank
    @Getter @Setter private String longitude;
    
    @NotBlank 
    @Getter @Setter private String latitude;

}
