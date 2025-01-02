package com.petland.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.cadastro.model.entity.CadastroEntity;

public interface CadastroRepository extends JpaRepository<CadastroEntity, Integer> {
}
