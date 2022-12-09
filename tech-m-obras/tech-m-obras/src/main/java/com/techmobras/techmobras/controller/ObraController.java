package com.techmobras.techmobras.controller;

import java.util.List;
import java.util.Optional;


import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.techmobras.techmobras.dto.ObraDTO;

import com.techmobras.techmobras.model.Obra;

import com.techmobras.techmobras.service.ObraService;

@RestController

@CrossOrigin(origins = "*")
@RequestMapping(value = "/obras")
public class ObraController {
    @Autowired
    ObraService obraService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> findById(@PathVariable(value = "id") Integer id) {
        Optional<Obra> obraOptional = obraService.findById(id);
        if (!obraOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Obra não encontrada");
        }
        return ResponseEntity.status(HttpStatus.OK).body(obraOptional.get());

    }

    @GetMapping
    public ResponseEntity<List<Obra>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(obraService.findAll());

    }

    @PostMapping
    public ResponseEntity<Object> saveObra(@RequestBody @Valid ObraDTO obraDTO) {
        Obra obra = new Obra();
        BeanUtils.copyProperties(obraDTO, obra);
        return ResponseEntity.status(HttpStatus.CREATED).body(obraService.save(obra));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") Integer id) {
        Optional<Obra> obraOptional = obraService.findById(id);
        if (!obraOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Obra não encontrada");
        }
        obraService.delete(obraOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Obra deletada");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable(value = "id") Integer id,
            @RequestBody @Valid ObraDTO obraDTO) {
        Optional<Obra> obraOptional = obraService.findById(id);
        if (!obraOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id não encontrado");
        }
        Obra obra = new Obra();
        BeanUtils.copyProperties(obraOptional, obra);
        obra.setId(obraOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(obraService.save(obra));

    }
}

