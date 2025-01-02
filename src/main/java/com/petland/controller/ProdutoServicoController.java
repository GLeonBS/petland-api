package com.petland.controller;

import com.petland.model.entity.ProdutoServicoEntity;
import com.petland.repository.ProdutoServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
