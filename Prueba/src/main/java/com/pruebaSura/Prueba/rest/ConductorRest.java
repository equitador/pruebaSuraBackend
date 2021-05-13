package com.pruebaSura.Prueba.rest;

import com.pruebaSura.Prueba.dao.ConductorDao;
import com.pruebaSura.Prueba.model.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("conductor")
public class ConductorRest {

    @Autowired
    private ConductorDao conductorDao;

    @PostMapping("/guardar")
    public void guardar (@RequestBody Conductor conductor){
        conductorDao.save(conductor);
    }
}
