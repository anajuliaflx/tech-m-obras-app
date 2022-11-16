package com.techmobras.techmobras.enums;

public enum StatusInspecao {
    EM_DIA(1), 
    PENDENTE(2);
    
    private int code;

    private StatusInspecao (int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static StatusInspecao ValorSI(int code){
        for(StatusInspecao value : StatusInspecao.values()){
            if (code == value.getCode()){
                return value;
            }
        }throw new IllegalArgumentException("Argumento não existente");
    }

}
