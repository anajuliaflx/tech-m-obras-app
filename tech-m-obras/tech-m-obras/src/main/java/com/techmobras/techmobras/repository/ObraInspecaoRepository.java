package com.techmobras.techmobras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techmobras.techmobras.model.ObraInspecao;

@Repository
public interface ObraInspecaoRepository extends JpaRepository<ObraInspecao, Integer>{
    
}
