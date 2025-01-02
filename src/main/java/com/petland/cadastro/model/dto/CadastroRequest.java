package com.petland.cadastro.model.dto;

import com.petland.cadastro.model.Endereco;
import com.petland.cadastro.model.Perfil;

import lombok.Data;

@Data
public class CadastroRequest {
    private String nome;
    private Perfil perfil;
    private Endereco endereco;
}
