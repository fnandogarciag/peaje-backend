package com.peaje.backend.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Entity
@Table(name = "tiempo_tipos_mutacion")
@Getter
@Setter
@NoArgsConstructor
public class TimeTypeMutationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "id_tipo")
    private Integer idTipo;
    @Column(name = "id_mutacion")
    private Integer idMutacion;
    private Integer hora;
    private Integer minuto;
    private Integer segundo;
}
