package com.peaje.backend.service;

import com.peaje.backend.persistence.entity.CarMutationEntity;
import com.peaje.backend.persistence.repository.CarMutationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarMutationService {
    private final CarMutationRepository carMutationRepository;

    @Autowired
    public CarMutationService(CarMutationRepository carMutationRepository) {
        this.carMutationRepository = carMutationRepository;
    }

    public List<CarMutationEntity> getAll() {
        return this.carMutationRepository.findAll();
    }

    public CarMutationEntity save(CarMutationEntity car) {
        return this.carMutationRepository.save(car);
    }
}
