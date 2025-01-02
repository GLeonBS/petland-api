package com.petland.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.cadastro.model.entity.AnimalEntity;

public interface AnimalRepository extends JpaRepository<AnimalEntity, Integer> {
}
