package com.peaje.backend.web.controller;

import com.peaje.backend.persistence.entity.CarMutationEntity;
import com.peaje.backend.service.CarMutationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros-mutaciones")
public class CarMutationController {
    private final CarMutationService carMutationService;

    public CarMutationController(CarMutationService carMutationService) {
        this.carMutationService = carMutationService;
    }


    @GetMapping
    public ResponseEntity<List<CarMutationEntity>> getAll() {
        return ResponseEntity.ok(this.carMutationService.getAll());
    }

    @PostMapping
    public ResponseEntity<CarMutationEntity> add(@RequestBody CarMutationEntity car) {
        return ResponseEntity.ok(this.carMutationService.save(car));
    }
}
