package com.techmobras.techmobras.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.techmobras.techmobras.enums.ObraRisco;
import com.techmobras.techmobras.enums.ObraTipo;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ObraDetalhesTecnicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "obra_id", referencedColumnName = "id")
    @Column(nullable = false)
    private Obra obraId;

    @Enumerated
    @Column(nullable = false, length = 45)
    private ObraTipo tipo;

    @Enumerated
    @Column(nullable = false, length = 45)
    private ObraRisco risco;

}
