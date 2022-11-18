package com.techmobras.techmobras.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.techmobras.techmobras.repository.ObraDetalhesTecnicosRepository;

@Service
public class ObraDetalhesTecnicos {
    final private ObraDetalhesTecnicosRepository obraDetalhesTecnicosRepository;

    public ObraDetalhesTecnicos(ObraDetalhesTecnicosRepository obraDetalhesTecnicosRepository) {
        this.obraDetalhesTecnicosRepository = obraDetalhesTecnicosRepository;
    }

    @Transactional
    public ObraDetalhesTecnicos save(ObraDetalhesTecnicos obraDetalhesTecnicos) {
        return obraDetalhesTecnicosRepository.save(obraDetalhesTecnicos);
    }

    public List<com.techmobras.techmobras.model.ObraDetalhesTecnicos> findAll() {
        return obraDetalhesTecnicosRepository.findAll();
    }

    public Optional<com.techmobras.techmobras.model.ObraDetalhesTecnicos> findById(Integer id) {
        return obraDetalhesTecnicosRepository.findById(id);
    }

    @Transactional
    public void delete(ObraDetalhesTecnicos obraDetalhesTecnicos) {
        obraDetalhesTecnicos.delete(obraDetalhesTecnicos);
    }

}
