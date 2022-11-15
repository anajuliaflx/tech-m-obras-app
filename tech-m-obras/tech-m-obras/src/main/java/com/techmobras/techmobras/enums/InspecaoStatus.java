package com.techmobras.techmobras.enums;

public enum InspecaoStatus {

    EM_DIA(1),
    PENDENTE(2);

    private int code;

    private InspecaoStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static InspecaoStatus valeuOf(int code) {
        for (InspecaoStatus value : InspecaoStatus.values()) {
            if (code == value.getCode()) {
                return value;
            }
        }
        throw new IllegalArgumentException("Código de InspecaoStatus inválido!");
    }
    
}
