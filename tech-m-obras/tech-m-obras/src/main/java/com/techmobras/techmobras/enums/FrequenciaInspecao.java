package com.techmobras.techmobras.enums;

public enum FrequenciaInspecao {
    ANUAL(1), 
    BIENAL(2), 
    QUINQUENAL(3);
    
    private int code;

    private FrequenciaInspecao(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static FrequenciaInspecao ValorFI(int code){
        for(FrequenciaInspecao value : FrequenciaInspecao.values()){
            if(code ==value.getCode()){
                return value;
            }
        }throw new IllegalArgumentException("Argumento não existente");
    }
}
