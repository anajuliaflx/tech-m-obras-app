package com.techmobras.techmobras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

import com.techmobras.techmobras.enums.ObraRisco;
import com.techmobras.techmobras.enums.ObraTipo;

@Entity
public class ObraDetalhesTecnicos implements Serializable  {
	

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(length = 45, nullable = false)
    private ObraTipo tipo;

    @Column(length = 45, nullable = false)
    private ObraRisco risco;

    @OneToOne
    @JoinColumn(name = "idObra")
    private Obra obraId;

	public ObraDetalhesTecnicos(BigInteger id, ObraTipo tipo, ObraRisco risco, Obra obraId) {
		this.id = id;
		this.tipo = tipo;
		this.risco = risco;
		this.obraId = obraId;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public ObraTipo getTipo() {
		return tipo;
	}

	public void setTipo(ObraTipo tipo) {
		this.tipo = tipo;
	}

	public ObraRisco getRisco() {
		return risco;
	}

	public void setRisco(ObraRisco risco) {
		this.risco = risco;
	}

	public Obra getObraId() {
		return obraId;
	}

	public void setObraId(Obra obraId) {
		this.obraId = obraId;
	}
    
    
}
