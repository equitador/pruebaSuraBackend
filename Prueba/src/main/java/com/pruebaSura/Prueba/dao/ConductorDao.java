package com.pruebaSura.Prueba.dao;

import com.pruebaSura.Prueba.model.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConductorDao extends JpaRepository<Conductor, Integer> {
}
