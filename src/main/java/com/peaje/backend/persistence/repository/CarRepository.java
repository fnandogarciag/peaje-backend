package com.peaje.backend.persistence.repository;

import com.peaje.backend.persistence.entity.CarEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface CarRepository extends ListCrudRepository<CarEntity, Integer> {
    List<CarEntity> findAllByOrderByPrecioAsc();
}
