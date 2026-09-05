package com.peaje.backend.persistence.entity;

import com.peaje.backend.domain.Mutation;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mutaciones")
@Getter
@Setter
@NoArgsConstructor
public class MutationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Mutation nombre;
    private Double multiplicador;
    private Integer orden;
}
