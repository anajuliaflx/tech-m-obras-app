package com.techmobras.techmobras.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;


@Entity
public class Inspecao {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id; 
    @ManyToMany
    @JoinColumn (name = "obraInspecaoId")
    private ObraInspecao obraInspecao;
    private Date data;
    private String observacoes;

    public Inspecao(){
        
    }

    
    public Inspecao(ObraInspecao obraInspecao, Date data, String observacoes) {
        this.obraInspecao = obraInspecao;
        this.data = data;
        this.observacoes = observacoes;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public ObraInspecao getObraInspecao() {
        return obraInspecao;
    }
    public void setObraInspecao(ObraInspecao obraInspecao) {
        this.obraInspecao = obraInspecao;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    
}
