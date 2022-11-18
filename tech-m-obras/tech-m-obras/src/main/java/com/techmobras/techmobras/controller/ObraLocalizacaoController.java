package com.techmobras.techmobras.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmobras.techmobras.dto.ObraLocalizacaoDTO;
import com.techmobras.techmobras.model.ObraLocalizacao;
import com.techmobras.techmobras.service.ObraLocalizacaoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/obra_localizacao")
public class ObraLocalizacaoController {

    final ObraLocalizacaoService obraLocalizacaoService;

    public ObraLocalizacaoController(ObraLocalizacaoService obraLocalizacaoService) {
        this.obraLocalizacaoService = obraLocalizacaoService;
    }

    @PostMapping
    public ResponseEntity<Object> saveObraLocalizacao(@RequestBody @Valid ObraLocalizacaoDTO obraLocalizacaoDTO) {
        ObraLocalizacao obraLocalizacao = new ObraLocalizacao();
        BeanUtils.copyProperties(obraLocalizacaoDTO, obraLocalizacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(obraLocalizacaoService.save(obraLocalizacao));
    }

    @GetMapping
    public ResponseEntity<List<ObraLocalizacao>> getAllObraLocalizacao(){
        return ResponseEntity.status(HttpStatus.OK).body(obraLocalizacaoService.findAll());
    }
}
