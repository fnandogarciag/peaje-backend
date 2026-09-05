package com.peaje.backend.web.controller;

import com.peaje.backend.persistence.entity.CarEntity;
import com.peaje.backend.persistence.entity.MutationEntity;
import com.peaje.backend.service.CarService;
import com.peaje.backend.service.MutationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mutaciones")
public class MutationController {
    private final MutationService mutationService;

    public MutationController(MutationService mutationService) {
        this.mutationService = mutationService;
    }


    @GetMapping
    public ResponseEntity<List<MutationEntity>> getAll() {
        return ResponseEntity.ok(this.mutationService.getAll());
    }

    @PostMapping
    public ResponseEntity<MutationEntity> add(@RequestBody MutationEntity mutation) {
        return ResponseEntity.ok(this.mutationService.save(mutation));
    }
}
