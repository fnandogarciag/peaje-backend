package com.peaje.backend.service;

import com.peaje.backend.persistence.entity.MutationEntity;
import com.peaje.backend.persistence.repository.MutationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MutationService {
    private final MutationRepository mutationRepository;

    @Autowired
    public MutationService(MutationRepository mutationRepository) {
        this.mutationRepository = mutationRepository;
    }

    public List<MutationEntity> getAll() {
        return this.mutationRepository.findAllByOrderByOrdenAsc();
    }

    public MutationEntity save(MutationEntity car) {
        return this.mutationRepository.save(car);
    }
}
