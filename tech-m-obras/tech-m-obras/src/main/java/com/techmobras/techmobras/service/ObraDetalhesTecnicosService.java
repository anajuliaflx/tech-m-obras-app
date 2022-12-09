package com.techmobras.techmobras.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.techmobras.techmobras.model.ObraDetalhesTecnicos;
import com.techmobras.techmobras.repository.ObraDetalhesTecnicosRepository;

@Service
public class ObraDetalhesTecnicosService {
    final private ObraDetalhesTecnicosRepository obraDetalhesTecnicosRepository;

    public ObraDetalhesTecnicosService(ObraDetalhesTecnicosRepository obraDetalhesTecnicosRepository) {
        this.obraDetalhesTecnicosRepository = obraDetalhesTecnicosRepository;
    }

   
    public com.techmobras.techmobras.model.ObraDetalhesTecnicos save(com.techmobras.techmobras.model.ObraDetalhesTecnicos obraDetalhesTecnicos) {
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
        obraDetalhesTecnicosRepository.delete(obraDetalhesTecnicos);
    }

}
