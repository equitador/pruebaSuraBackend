package com.pruebaSura.Prueba.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Conductor {

    @Id
    private int id;

    @Column
    private String nombre;
}
