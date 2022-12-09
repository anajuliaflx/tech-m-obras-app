package com.techmobras.techmobras.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ObraLocalizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Column(length = 45)
    private String cidade;

    @OneToOne(fetch = FetchType.LAZY)
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
