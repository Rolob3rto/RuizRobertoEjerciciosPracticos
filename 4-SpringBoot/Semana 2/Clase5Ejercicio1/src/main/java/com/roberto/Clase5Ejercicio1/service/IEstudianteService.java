package com.roberto.Clase5Ejercicio1.service;

import com.roberto.Clase5Ejercicio1.model.Estudiante;

import java.util.List;

public interface IEstudianteService {

    List<Estudiante> listarEstudiantes();

    void inicializarEstudiantes();
}
