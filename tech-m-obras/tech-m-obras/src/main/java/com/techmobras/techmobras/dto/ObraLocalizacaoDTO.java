package com.techmobras.techmobras.dto;

import javax.validation.constraints.NotBlank;

public class ObraLocalizacaoDTO {
   
    @NotBlank
    private String estado;

    @NotBlank
    private String cidade;

    @NotBlank
    private String longitute;

    @NotBlank
    private String latitude;


    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getLongitute() {
        return longitute;
    }
    public void setLongitute(String longitute) {
        this.longitute = longitute;
    }
    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

}
