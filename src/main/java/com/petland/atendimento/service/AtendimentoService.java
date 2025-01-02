package com.petland.atendimento.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.atendimento.dto.AtendimentoRequest;
import com.petland.atendimento.dto.AtendimentoResponse;
import com.petland.atendimento.model.entity.AtendimentoEntity;
import com.petland.atendimento.repository.AtendimentoRepository;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository repository;

    public Integer gravar(AtendimentoRequest request) {
        AtendimentoEntity entity = new AtendimentoEntity();
        BeanUtils.copyProperties(request, entity);
        return repository.save(entity).getId();
    }

    public Integer alterar(Integer id, AtendimentoRequest request) {
        AtendimentoEntity Atendimento = repository.findById(id).orElse(null);
        if (Atendimento != null) {
            BeanUtils.copyProperties(request, Atendimento);
            return repository.save(Atendimento).getId();
        }
        return null;
    }

    public List<AtendimentoResponse> listar() {
        List<AtendimentoEntity> entities = repository.findAll();
        List<AtendimentoResponse> responses = new ArrayList<>();
        entities.forEach(entity -> {
            AtendimentoResponse response = new AtendimentoResponse();
            BeanUtils.copyProperties(entity, response);
            responses.add(response);
        });

        return responses;
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
}
