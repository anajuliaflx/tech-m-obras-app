package com.techmobras.techmobras.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class InspecaoDTO {

    @NotNull
    private Date data;

    @NotBlank
    private String observacoes;

}