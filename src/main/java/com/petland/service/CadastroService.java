package com.petland.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.model.dto.CadastroRequest;
import com.petland.model.dto.CadastroResponse;
import com.petland.model.entity.CadastroEntity;
import com.petland.repository.CadastroRepository;

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
