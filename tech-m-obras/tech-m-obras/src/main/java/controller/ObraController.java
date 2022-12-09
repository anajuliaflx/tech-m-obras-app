package com.techmobras.techmobras.controller;


import com.techmobras.techmobras.model.Obra;
import com.techmobras.techmobras.repository.ObraRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/obra")
public class ObraController {

    private ObraRepository obraRepository;

    public ObraController(ObraRepository obraRepository) {
        this.obraRepository = obraRepository;
    }

    @GetMapping(value = "{id}")
    @ResponseStatus(OK)
    public Obra getObraById(@PathVariable int id) {
        return obraRepository
                .findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Obra não encontrada"));
    }

    @GetMapping
    public List<Obra> find(Obra filtro) {
        ExampleMatcher encontrar = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example exemplo = Example.of(filtro, encontrar);
        return obraRepository.findAll(exemplo);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Obra save(@RequestBody Obra obra) {
        return obraRepository.save(obra);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        obraRepository.findById(id)
                .map(Obra -> {
                    obraRepository.delete(Obra);
                    return Void.TYPE;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "obra não encontrada"));
    }

    @PutMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void update(@PathVariable Integer id,
                       @RequestBody Obra obra) {
        obraRepository
                .findById(id)
                .map(obraExistente -> {
                    obra.setId(obraExistente.getId());
                    obraRepository.save(obra);
                    return obraExistente;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "obra não encontrada"));
    }
}

