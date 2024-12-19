package com.petland.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tab_cadastro")
public class Cadastro {
    @Id
    private Integer id;
    private String nome;

    //private Perfil perfil;
    //private Endereco endereco;
}
