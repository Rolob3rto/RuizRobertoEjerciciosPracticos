package com.roberto.Clase5Ejercicio1.controller;

import com.roberto.Clase5Ejercicio1.model.Estudiante;
import com.roberto.Clase5Ejercicio1.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    IEstudianteService estudianteService;
    @GetMapping
    public List<Estudiante> listarEstudiantes(){

        return estudianteService.listarEstudiantes();
    }
}
