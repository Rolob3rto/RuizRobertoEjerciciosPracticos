package com.roberto.Clase5Ejercicio1.controller;

import com.roberto.Clase5Ejercicio1.dto.CalificacionDTO;
import com.roberto.Clase5Ejercicio1.model.Calificacion;
import com.roberto.Clase5Ejercicio1.service.ICalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {

    @Autowired
    ICalificacionService calificacionService;


    @GetMapping("/{numMatricula}")
    public List<Calificacion> listarCalificacionesPorMatricula(@PathVariable String numMatricula){
        return calificacionService.listarCalificacionesDeEstudiante(numMatricula);
    }

    @GetMapping("/ordendesc")
    public List<CalificacionDTO> listarCalificaciones (){

        return calificacionService.findAll();
    }
}
