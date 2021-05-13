package com.pruebaSura.Prueba.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Carro {

    @Id
    private String placa;

    @Column
    private String marca;

    @Column
    private int modelo;

    @Column
    private int InConductor;
}
