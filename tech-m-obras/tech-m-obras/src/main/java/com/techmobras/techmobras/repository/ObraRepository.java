package com.techmobras.techmobras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techmobras.techmobras.model.Obra;

@Repository
public interface ObraRepository extends JpaRepository<Obra, Long> {

}
