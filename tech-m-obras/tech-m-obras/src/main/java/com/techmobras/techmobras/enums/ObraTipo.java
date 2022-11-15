package com.techmobras.techmobras.enums;

public enum ObraTipo {

    HIDRAULICA(1),
    ESTRUTURAL(2),
    GEOTECNICA(3);

    private int code;

    private ObraTipo(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static ObraTipo valeuOf(int code) {
        for (ObraTipo value : ObraTipo.values()) {
            if (code == value.getCode()) {
                return value;
            }
        }
        throw new IllegalArgumentException("Código de ObraTipo inválido!");
    }

}