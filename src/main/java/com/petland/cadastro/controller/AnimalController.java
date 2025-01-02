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

import com.petland.cadastro.model.dto.AnimalRequest;
import com.petland.cadastro.model.dto.AnimalResponse;
import com.petland.cadastro.service.AnimalService;

@RestController
@RequestMapping("/animais")
public class AnimalController {
    @Autowired
    private AnimalService service;

    @PostMapping
    public Integer criar(@RequestBody AnimalRequest animal) {
        return service.gravar(animal);
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable("id") Integer id,
            @RequestBody AnimalRequest requisicao) {
        return service.alterar(id, requisicao);
    }

    @GetMapping()
    public List<AnimalResponse> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id) {
        service.excluir(id);
    }
}
