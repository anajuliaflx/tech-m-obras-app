package com.techmobras.techmobras.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.techmobras.techmobras.enums.FrequenciaInspecao;
import com.techmobras.techmobras.enums.StatusInspecao;

@Entity
public class ObraInspecao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "idObra")
    private Obra obra;
    private Integer frequenciaInspecao;
    private int mes;
    private Integer statusInspecao;
    private int prioridade;

    public ObraInspecao() {

    }

    public ObraInspecao(Obra obra, Integer frequenciaInspecao, int mes, Integer statusInspecao, int prioridade) {
        this.obra = obra;
        this.frequenciaInspecao = frequenciaInspecao;
        this.mes = mes;
        this.statusInspecao = statusInspecao;
        this.prioridade = prioridade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public FrequenciaInspecao getFrequenciaInspecao() {
        return FrequenciaInspecao.ValorFI(frequenciaInspecao);
    }

    public void setFrequenciaInspecao(FrequenciaInspecao frequenciaInspecao) {
        if(frequenciaInspecao!=null){
            this.frequenciaInspecao = frequenciaInspecao.getCode();
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public StatusInspecao getStatusInspecao() {
        return StatusInspecao.ValorSI(statusInspecao);
    }

    public void setStatusInspecao(StatusInspecao statusInspecao) {
        if(statusInspecao!=null){
            this.statusInspecao = statusInspecao.getCode();
        }  
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }    
    
}
