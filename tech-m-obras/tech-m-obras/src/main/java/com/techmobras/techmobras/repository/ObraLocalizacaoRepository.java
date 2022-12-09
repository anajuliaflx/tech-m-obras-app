package com.techmobras.techmobras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techmobras.techmobras.model.ObraLocalizacao;

@Repository
public interface ObraLocalizacaoRepository extends JpaRepository<ObraLocalizacao, Integer> {

    

}
