package com.peaje.backend.web.controller;

import com.peaje.backend.persistence.entity.CarEntity;
import com.peaje.backend.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<List<CarEntity>> getAll() {
        return ResponseEntity.ok(this.carService.getAll());
    }

    @PostMapping
    public ResponseEntity<CarEntity> add(@RequestBody CarEntity car) {
        return ResponseEntity.ok(this.carService.save(car));
    }
}
