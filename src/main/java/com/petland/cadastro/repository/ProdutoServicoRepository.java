package com.petland.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.cadastro.model.entity.ProdutoServicoEntity;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServicoEntity, Integer> {
}
