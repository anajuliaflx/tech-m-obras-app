package com.techmobras.techmobras.controller;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmobras.techmobras.dto.ObraInspecaoDTO;

import com.techmobras.techmobras.model.ObraInspecao;
import com.techmobras.techmobras.service.ObraInspecaoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/obra-inspecao")
public class ObraInspecaoController {
    final ObraInspecaoService obraInspecaoService;

    public ObraInspecaoController(ObraInspecaoService obraInspecaoService) {
        this.obraInspecaoService = obraInspecaoService;
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid ObraInspecaoDTO obraInspecaoDTO,
            @RequestHeader Integer obraId) {
        ObraInspecao obraInspecao = new ObraInspecao();
        
            
       
        BeanUtils.copyProperties(obraInspecaoDTO, obraInspecao);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(obraInspecaoService.save(obraInspecao));
    }

    @GetMapping
    public ResponseEntity<List<ObraInspecao>> getAllo() {
        return ResponseEntity.status(HttpStatus.OK).body(obraInspecaoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneObra(@PathVariable(value = "id") Integer id) {
        Optional<ObraInspecao> obraInspecaoOptional = obraInspecaoService.findById(id);
        if (!obraInspecaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inspeções de obra não encontradas");
        }
        return ResponseEntity.status(HttpStatus.OK).body(obraInspecaoOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") Integer id) {
        Optional<ObraInspecao> obraInspecaoOptional = obraInspecaoService.findById(id);
        if (!obraInspecaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inspeções de obra não encontradas");
        }
        obraInspecaoService.delete(obraInspecaoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Inspeções de obra deletadas com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> uptade(@PathVariable(value = "id") Integer id,
            @RequestBody @Valid ObraInspecaoDTO obraInspecaoDTO) {
        Optional<ObraInspecao> obraInspecaoOptional = obraInspecaoService.findById(id);
        if (!obraInspecaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inspeções de obra não encontradas");
        }
        ObraInspecao obraInspecao = new ObraInspecao();
        BeanUtils.copyProperties(obraInspecaoDTO, obraInspecao);
        obraInspecao.setId(obraInspecaoOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(obraInspecaoService.save(obraInspecao));
    }

    
}
