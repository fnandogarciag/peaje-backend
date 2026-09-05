package com.peaje.backend.web.controller;

import com.peaje.backend.persistence.entity.TimeTypeMutationEntity;
import com.peaje.backend.service.TimeTypeMutationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiempo")
public class TimeTypeMutationController {
    private final TimeTypeMutationService timeTypeMutationService;

    public TimeTypeMutationController(TimeTypeMutationService timeTypeMutationService) {
        this.timeTypeMutationService = timeTypeMutationService;
    }


    @GetMapping
    public ResponseEntity<List<TimeTypeMutationEntity>> getAll() {
        return ResponseEntity.ok(this.timeTypeMutationService.getAll());
    }

    @PostMapping
    public ResponseEntity<TimeTypeMutationEntity> add(@RequestBody TimeTypeMutationEntity car) {
        return ResponseEntity.ok(this.timeTypeMutationService.save(car));
    }
}
