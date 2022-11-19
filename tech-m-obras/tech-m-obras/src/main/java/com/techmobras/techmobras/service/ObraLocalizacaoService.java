package com.techmobras.techmobras.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.techmobras.techmobras.model.ObraLocalizacao;
import com.techmobras.techmobras.repository.ObraLocalizacaoRepository;

@Service
public class ObraLocalizacaoService {
    
    final ObraLocalizacaoRepository obraLocalizacaoRepository;

    public ObraLocalizacaoService(ObraLocalizacaoRepository obraLocalizacaoRepository) {
        this.obraLocalizacaoRepository = obraLocalizacaoRepository;
    }

    @Transactional
    public ObraLocalizacao save(ObraLocalizacao obraLocalizacao) {
        return obraLocalizacaoRepository.save(obraLocalizacao);
    }

    public List<ObraLocalizacao> findAll() {
        return obraLocalizacaoRepository.findAll();
    }

    public Optional<ObraLocalizacao> findById(Integer id) {
        return obraLocalizacaoRepository.findById(id);
    }

    @Transactional
    public void delete(ObraLocalizacao obraLocalizacao) {
        obraLocalizacaoRepository.delete(obraLocalizacao);
    }

}
