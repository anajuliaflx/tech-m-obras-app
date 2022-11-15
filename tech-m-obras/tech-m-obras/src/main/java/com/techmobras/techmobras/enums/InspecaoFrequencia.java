package com.techmobras.techmobras.enums;

public enum InspecaoFrequencia {

    ANUAL(1),
    BIENAL(2),
    QUINQUENAL(3);
    
    private int code;

    private InspecaoFrequencia(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static InspecaoFrequencia valeuOf(int code) {
        for (InspecaoFrequencia value : InspecaoFrequencia.values()) {
            if (code == value.getCode()) {
                return value;
            }
        }
        throw new IllegalArgumentException("Código de InspecaoFrequencia inválido!");
    }

}
