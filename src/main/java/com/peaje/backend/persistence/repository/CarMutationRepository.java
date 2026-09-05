package com.peaje.backend.persistence.repository;

import com.peaje.backend.persistence.entity.CarMutationEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface CarMutationRepository extends ListCrudRepository<CarMutationEntity, Integer> {
}
