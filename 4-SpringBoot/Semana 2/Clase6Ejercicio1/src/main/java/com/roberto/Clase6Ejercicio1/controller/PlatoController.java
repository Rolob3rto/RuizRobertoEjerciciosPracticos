package com.roberto.Clase6Ejercicio1.controller;

import com.roberto.Clase6Ejercicio1.dto.PlatoDTO;
import com.roberto.Clase6Ejercicio1.service.IPlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/platos")
public class PlatoController {

    @Autowired
    IPlatoService platoService;

    @GetMapping("/{nombre}")
        public PlatoDTO obtenerPlato(@PathVariable String nombre){

            return platoService.findPlato(nombre);
        }
}
