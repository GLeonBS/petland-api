package com.petland.cadastro.model.dto;

import java.time.LocalDate;

import com.petland.cadastro.model.AnimalEspecie;

import lombok.Data;

@Data
public class AnimalRequest {
    private String nome;
    private LocalDate aniversario;
    private AnimalEspecie especie;
    private Integer tutor;
}
