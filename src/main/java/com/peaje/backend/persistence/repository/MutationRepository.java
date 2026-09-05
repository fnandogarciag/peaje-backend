package com.peaje.backend.persistence.repository;

import com.peaje.backend.persistence.entity.MutationEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface MutationRepository extends ListCrudRepository<MutationEntity, Integer> {
    List<MutationEntity> findAllByOrderByOrdenAsc();
}
