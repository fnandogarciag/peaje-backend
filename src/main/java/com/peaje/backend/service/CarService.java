package com.peaje.backend.service;

import com.peaje.backend.persistence.entity.CarEntity;
import com.peaje.backend.persistence.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarEntity> getAll() {
        return this.carRepository.findAllByOrderByPrecioAsc();
    }

    public CarEntity save(CarEntity car) {
        return this.carRepository.save(car);
    }
}
