package com.techmobras.techmobras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techmobras.techmobras.model.Inspecao;

@Repository
public interface InspecaoRepository extends JpaRepository<Inspecao, Integer>{
    
}
