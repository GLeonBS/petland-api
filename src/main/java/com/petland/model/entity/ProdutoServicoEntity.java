package com.petland.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tab_produto_servico")
@Data
public class ProdutoServicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Setter(AccessLevel.NONE)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nome;
    private Double valor;
    private boolean servico;
}
