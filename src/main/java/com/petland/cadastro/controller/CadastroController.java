package com.petland.cadastro.controller;

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

import com.petland.cadastro.model.dto.CadastroRequest;
import com.petland.cadastro.model.dto.CadastroResponse;
import com.petland.cadastro.service.CadastroService;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
    @Autowired
    private CadastroService service;

    @PostMapping
    public Integer criar(@RequestBody CadastroRequest cliente) {
        return service.gravar(cliente);
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable("id") Integer id,
            @RequestBody CadastroRequest requisicao) {
        return service.alterar(id, requisicao);
    }

    @GetMapping()
    public List<CadastroResponse> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id) {
        service.excluir(id);
    }
}
