package com.petland.repository;

import com.petland.model.entity.ProdutoServicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServicoEntity, Integer> {
}
