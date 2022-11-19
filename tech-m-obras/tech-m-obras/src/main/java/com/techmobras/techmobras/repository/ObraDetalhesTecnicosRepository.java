package com.techmobras.techmobras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techmobras.techmobras.model.ObraDetalhesTecnicos;

@Repository
public interface ObraDetalhesTecnicosRepository extends JpaRepository<ObraDetalhesTecnicos, Integer> {

    com.techmobras.techmobras.service.ObraDetalhesTecnicos save(
            com.techmobras.techmobras.service.ObraDetalhesTecnicos obraDetalhesTecnicos);

}
