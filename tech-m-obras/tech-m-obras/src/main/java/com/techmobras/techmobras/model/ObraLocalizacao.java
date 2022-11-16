package com.techmobras.techmobras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "obra_localizacao")
public class ObraLocalizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45, nullable = false)
    private String estado;

    @Column(length = 45, nullable = false)
    private String cidade;

    @Column(length = 45, nullable = false)
    private String latitude;

    @Column(length = 45, nullable = false)
    private String longitude;

    @OneToOne
    @JoinColumn(name = "idObra")
    private Obra obraId;

    public ObraLocalizacao(Long id, String estado, String cidade, String latitude, String longitude, Obra obraId) {
        this.id = id;
        this.estado = estado;
        this.cidade = cidade;
        this.latitude = latitude;
        this.longitude = longitude;
        this.obraId = obraId;
    }

    public ObraLocalizacao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Obra getObraId() {
        return obraId;
    }

    public void setObraId(Obra obraId) {
        this.obraId = obraId;
    }

    
}