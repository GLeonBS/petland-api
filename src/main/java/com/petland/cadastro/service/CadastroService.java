package com.petland.cadastro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.cadastro.model.dto.CadastroRequest;
import com.petland.cadastro.model.dto.CadastroResponse;
import com.petland.cadastro.model.entity.CadastroEntity;
import com.petland.cadastro.repository.CadastroRepository;

@Service
public class CadastroService {

    @Autowired
    private CadastroRepository repository;

    public Integer gravar(CadastroRequest request) {
        CadastroEntity entity = new CadastroEntity();
        BeanUtils.copyProperties(request, entity);
        return repository.save(entity).getId();
    }

    public Integer alterar(Integer id, CadastroRequest request) {
        CadastroEntity Cadastro = repository.findById(id).orElse(null);
        if (Cadastro != null) {
            BeanUtils.copyProperties(request, Cadastro);
            return repository.save(Cadastro).getId();
        }
        return null;
    }

    public List<CadastroResponse> listar() {
        List<CadastroEntity> entities = repository.findAll();
        List<CadastroResponse> responses = new ArrayList<>();
        entities.forEach(entity -> {
            CadastroResponse response = new CadastroResponse();
            BeanUtils.copyProperties(entity, response);
            responses.add(response);
        });

        return responses;
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
}
