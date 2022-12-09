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

import com.techmobras.techmobras.dto.ObraDetalhesTecnicosDTO;
import com.techmobras.techmobras.model.ObraDetalhesTecnicos;
import com.techmobras.techmobras.service.ObraDetalhesTecnicosService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/obra-detalhes-tecnicos")
public class ObraDetalhesTecnicosController {
    
    final ObraDetalhesTecnicosService obraDetalhesTecnicosService;

    public ObraDetalhesTecnicosController(ObraDetalhesTecnicosService obraDetalhesTecnicosService) {
        this.obraDetalhesTecnicosService = obraDetalhesTecnicosService;
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid ObraDetalhesTecnicosDTO obraDetalhesTecnicosDTO,
            @RequestHeader Integer obraId) {
        ObraDetalhesTecnicos obraDetalhesTecnicos = new ObraDetalhesTecnicos();
        
            
       
        BeanUtils.copyProperties(obraDetalhesTecnicosDTO, obraDetalhesTecnicos);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(obraDetalhesTecnicosService.save(obraDetalhesTecnicos));
    }

    @GetMapping
    public ResponseEntity<List<ObraDetalhesTecnicos>> getAllObraLocalizacao() {
        return ResponseEntity.status(HttpStatus.OK).body(obraDetalhesTecnicosService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable(value = "id") Integer id) {
        Optional<ObraDetalhesTecnicos> obraDetalhesTecnicosOptional = obraDetalhesTecnicosService.findById(id);
        if (!obraDetalhesTecnicosOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Detalhes tecnicos não encontrados");
        }
        return ResponseEntity.status(HttpStatus.OK).body(obraDetalhesTecnicosOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") Integer id) {
        Optional<ObraDetalhesTecnicos> obraDetalhesTecnicosOptional = obraDetalhesTecnicosService.findById(id);
        if (!obraDetalhesTecnicosOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Detalhes tecnicos não encontrados");
        }
        obraDetalhesTecnicosService.delete(obraDetalhesTecnicosOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Detalhes tecnicos deletados com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> uptade(@PathVariable(value = "id") Integer id,
            @RequestBody @Valid ObraDetalhesTecnicosDTO obraDetalhesTecnicosDTO) {
        Optional<ObraDetalhesTecnicos> obraDetalhesTecnicosOptional = obraDetalhesTecnicosService.findById(id);
        if (!obraDetalhesTecnicosOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Detalhes tecnicos não encontrados");
        }
        ObraDetalhesTecnicos obraDetalhesTecnicos = new ObraDetalhesTecnicos();
        BeanUtils.copyProperties(obraDetalhesTecnicosDTO, obraDetalhesTecnicos);
        obraDetalhesTecnicos.setId(obraDetalhesTecnicosOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(obraDetalhesTecnicosService.save(obraDetalhesTecnicos));
    }

    
}
