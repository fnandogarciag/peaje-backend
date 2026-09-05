package com.peaje.backend.web.controller;

import com.peaje.backend.persistence.entity.TypeEntity;
import com.peaje.backend.service.TypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipos")
public class TypeController {
    private final TypeService typeService;

    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }


    @GetMapping
    public ResponseEntity<List<TypeEntity>> getAll() {
        return ResponseEntity.ok(this.typeService.getAll());
    }

    @PostMapping
    public ResponseEntity<TypeEntity> add(@RequestBody TypeEntity car) {
        return ResponseEntity.ok(this.typeService.save(car));
    }
}
