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

import com.petland.cadastro.model.entity.ProdutoServicoEntity;
import com.petland.cadastro.repository.ProdutoServicoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoServicoController {
    @Autowired
    private ProdutoServicoRepository repository;

    @GetMapping
    public List<ProdutoServicoEntity> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Integer criar(@RequestBody ProdutoServicoEntity produto) {
        ProdutoServicoEntity produtoSaved = repository.save(produto);
        return produtoSaved.getId();
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable("id") Integer id,
            @RequestBody ProdutoServicoEntity produto) {
        produto.setId(id);
        ProdutoServicoEntity produtoSaved = repository.save(produto);
        return produtoSaved.getId();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }
}
