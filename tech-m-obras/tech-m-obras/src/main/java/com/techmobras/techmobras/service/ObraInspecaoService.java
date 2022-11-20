package com.techmobras.techmobras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techmobras.techmobras.model.ObraInspecao;
import com.techmobras.techmobras.repository.ObraInspecaoRepository;

@Service
public class ObraInspecaoService {

    final ObraInspecaoRepository obraInspecaoRepository;

    public ObraInspecaoService(ObraInspecaoRepository obraInspecaoRepository) {
        this.obraInspecaoRepository = obraInspecaoRepository;
    }
    
    @Transactional
    public ObraInspecao save(ObraInspecao obraInspecao) {
        return obraInspecaoRepository.save(obraInspecao);
    }

    public List<ObraInspecao> findAll() {
        return obraInspecaoRepository.findAll();
    }

    public Optional<ObraInspecao> findById(Integer id) {
        return obraInspecaoRepository.findById(id);
    }

    @Transactional
    public void delete(ObraInspecao obraInspecao) {
        obraInspecaoRepository.delete(obraInspecao);
    }

}
