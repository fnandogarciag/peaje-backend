package com.peaje.backend.service;

import com.peaje.backend.persistence.entity.TypeEntity;
import com.peaje.backend.persistence.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {
    private final TypeRepository typeRepository;

    @Autowired
    public TypeService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    public List<TypeEntity> getAll() {
        return this.typeRepository.findAll();
    }

    public TypeEntity save(TypeEntity car) {
        return this.typeRepository.save(car);
    }
}
