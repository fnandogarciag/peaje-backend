package com.peaje.backend.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "carros_mutaciones")
@Getter
@Setter
@NoArgsConstructor
public class CarMutationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "id_carro")
    private Integer idCarro;
    @Column(name = "id_mutacion")
    private Integer idMutacion;
    private Integer inventario;
    private Integer usando;
}
