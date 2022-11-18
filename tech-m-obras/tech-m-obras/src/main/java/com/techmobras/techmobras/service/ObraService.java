package com.techmobras.techmobras.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.techmobras.techmobras.model.Obra;
import com.techmobras.techmobras.repository.ObraRepository;

@Service
public class ObraService {

    final private ObraRepository obrarepository;

    public ObraService(ObraRepository obrarepository) {
        this.obrarepository = obrarepository;
    }

    @Transactional
    public Obra save(Obra obra) {
        return obrarepository.save(obra);
    }

    public List<Obra> findAll(Obra obra) {
        return obrarepository.findAll();
    }

    public Optional<Obra> findById(Integer id) {
        return obrarepository.findById(id);
    }

    @Transactional
    public void delete(Obra obra) {
     obrarepository.delete(obra);
    }

}
