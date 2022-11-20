package com.techmobras.techmobras.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ObraLocalizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    @Column(length = 45)
    private String cidade;

    @OneToOne
    @JoinColumn(name = "obra_id", referencedColumnName = "id")
    private Obra obraId;

    @NotBlank
    @Column(length = 45)
    private String estado;

    @NotBlank
    @Column(length = 45)
    private String latitude;

    @NotBlank
    @Column(length = 45)
    private String longitude;

}
