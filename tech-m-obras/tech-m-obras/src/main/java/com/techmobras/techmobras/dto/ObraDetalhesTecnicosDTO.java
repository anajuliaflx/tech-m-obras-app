package com.techmobras.techmobras.dto;



import com.techmobras.techmobras.enums.ObraRisco;
import com.techmobras.techmobras.enums.ObraTipo;
import com.techmobras.techmobras.model.Obra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.validation.constraints.NotNull;
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ObraDetalhesTecnicosDTO {
    @NotNull
    private Obra obraId;
    @NotNull
    private ObraTipo tipo;
    @NotNull
    private ObraRisco risco;

    
}
