package com.peaje.backend.service;

import com.peaje.backend.persistence.entity.TimeTypeMutationEntity;
import com.peaje.backend.persistence.repository.TimeTypeMutationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeTypeMutationService {
    private final TimeTypeMutationRepository timeTypeMutationRepository;

    @Autowired
    public TimeTypeMutationService(TimeTypeMutationRepository timeTypeMutationRepository) {
        this.timeTypeMutationRepository = timeTypeMutationRepository;
    }

    public List<TimeTypeMutationEntity> getAll() {
        return this.timeTypeMutationRepository.findAll();
    }

    public TimeTypeMutationEntity save(TimeTypeMutationEntity car) {
        return this.timeTypeMutationRepository.save(car);
    }
}
