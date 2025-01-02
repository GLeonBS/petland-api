package com.petland.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.model.dto.AnimalRequest;
import com.petland.model.dto.AnimalResponse;
import com.petland.model.entity.AnimalEntity;
import com.petland.repository.AnimalRepository;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository repository;

    public Integer gravar(AnimalRequest request) {
        AnimalEntity entity = new AnimalEntity();
        BeanUtils.copyProperties(request, entity);
        return repository.save(entity).getId();
    }

    public Integer alterar(Integer id, AnimalRequest request) {
        AnimalEntity animal = repository.findById(id).orElse(null);
        if (animal != null) {
            BeanUtils.copyProperties(request, animal);
            return repository.save(animal).getId();
        }
        return null;
    }

    public List<AnimalResponse> listar() {
        List<AnimalEntity> entities = repository.findAll();
        List<AnimalResponse> responses = new ArrayList<>();
        entities.forEach(entity -> {
            AnimalResponse response = new AnimalResponse();
            BeanUtils.copyProperties(entity, response);
            responses.add(response);
        });

        return responses;
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
}
