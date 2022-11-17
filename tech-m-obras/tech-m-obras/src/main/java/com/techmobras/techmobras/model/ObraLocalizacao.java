package com.techmobras.techmobras.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ObraLocalizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 45)
    private String cidade;

    @OneToOne
    @JoinColumn(name = "obra_id", referencedColumnName = "id")
    @Column(nullable = false)
    private Obra obraId;

    @Column(nullable = false, length = 45)
    private String estado;

    @Column(nullable = false, length = 45)
    private String latitude;

    @Column(nullable = false, length = 45)
    private String longitude;

}
