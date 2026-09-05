package com.peaje.backend.persistence.repository;

import com.peaje.backend.persistence.entity.TypeEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface TypeRepository extends ListCrudRepository<TypeEntity, Integer> {
}
