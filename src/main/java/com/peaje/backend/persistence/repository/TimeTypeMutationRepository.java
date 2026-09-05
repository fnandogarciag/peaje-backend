package com.peaje.backend.persistence.repository;

import com.peaje.backend.persistence.entity.TimeTypeMutationEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface TimeTypeMutationRepository extends ListCrudRepository<TimeTypeMutationEntity, Integer> {
}
