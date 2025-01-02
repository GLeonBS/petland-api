package com.petland.atendimento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.atendimento.dto.AtendimentoRequest;
import com.petland.atendimento.dto.AtendimentoResponse;
import com.petland.atendimento.service.AtendimentoService;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {
    @Autowired
    private AtendimentoService service;

    @PostMapping
    public Integer criar(@RequestBody AtendimentoRequest atendimento) {
        return service.gravar(atendimento);
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable("id") Integer id,
            @RequestBody AtendimentoRequest requisicao) {
        return service.alterar(id, requisicao);
    }

    @GetMapping()
    public List<AtendimentoResponse> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id) {
        service.excluir(id);
    }
}
