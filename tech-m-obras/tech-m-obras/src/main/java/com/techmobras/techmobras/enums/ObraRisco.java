package com.techmobras.techmobras.enums;

public enum ObraRisco {

    BAIXO(1),
    MEDIO(2),
    ALTO(3);

    private int code;

    private ObraRisco(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static ObraRisco valeuOf(int code) {
        for (ObraRisco value : ObraRisco.values()) {
            if (code == value.getCode()) {
                return value;
            }
        }
        throw new IllegalArgumentException("Código de ObraRisco inválido!");
    }
    
}
