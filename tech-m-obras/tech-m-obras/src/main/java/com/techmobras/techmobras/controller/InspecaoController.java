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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmobras.techmobras.dto.InspecaoDTO;
import com.techmobras.techmobras.model.Inspecao;

import com.techmobras.techmobras.service.InspecaoService;


@RequestMapping(value = "inspecoes")
@CrossOrigin(origins = "*")
@RestController
public class InspecaoController {
    @Autowired
    InspecaoService inspecaoService;

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid InspecaoDTO inspecaoDTO,
            @RequestHeader Integer obraId) {
        Inspecao inspecao = new Inspecao();
        
            
       
        BeanUtils.copyProperties(inspecaoDTO, inspecao);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(inspecaoService.save(inspecao));
    }

    @GetMapping
    public ResponseEntity<List<Inspecao>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(inspecaoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable(value = "id") Integer id) {
        Optional<Inspecao> inspecaoOptional = inspecaoService.findById(id);
        if (!inspecaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inspeção não encontrada");
        }
        return ResponseEntity.status(HttpStatus.OK).body(inspecaoOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") Integer id) {
        Optional<Inspecao> inspecaoOptional = inspecaoService.findById(id);
        if (!inspecaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inspeção não encontrada");
        }
        inspecaoService.delete(inspecaoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Inspeção deletada com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> uptade(@PathVariable(value = "id") Integer id,
            @RequestBody @Valid InspecaoDTO inspecaoDTO) {
        Optional<Inspecao> inspecaoOptional = inspecaoService.findById(id);
        if (!inspecaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inspeção não encontrada");
        }
        Inspecao inspecao = new Inspecao();
        BeanUtils.copyProperties(inspecaoDTO, inspecao);
        inspecao.setId(inspecaoOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(inspecaoService.save(inspecao));
    }
}
