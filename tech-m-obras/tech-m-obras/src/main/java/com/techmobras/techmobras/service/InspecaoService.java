package com.techmobras.techmobras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techmobras.techmobras.model.Inspecao;
import com.techmobras.techmobras.repository.InspecaoRepository;

@Service
public class InspecaoService {

    final InspecaoRepository inspecaoRepository;

    public InspecaoService(InspecaoRepository inspecaoRepository) {
        this.inspecaoRepository = inspecaoRepository;
    }
    
    @Transactional
    public Inspecao save(Inspecao inspecao) {
        return inspecaoRepository.save(inspecao);
    }

    public List<Inspecao> findAll() {
        return inspecaoRepository.findAll();
    }

    public Optional<Inspecao> findById(Integer id) {
        return inspecaoRepository.findById(id);
    }

    @Transactional
    public void delete(Inspecao inspecao) {
        inspecaoRepository.delete(inspecao);
    }

}

