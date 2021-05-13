package com.pruebaSura.Prueba.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
public class Desplazamiento {

    @Id
    private int id;

    @Column
    private String placa;

    @Column
    private String origen;

    @Column
    private String destino;

    @Column
    private Date fechOrigen;

    @Column
    private Date fechDestino;
}
