package com.roberto.Clase5Ejercicio1.service;

import com.roberto.Clase5Ejercicio1.dto.CalificacionDTO;
import com.roberto.Clase5Ejercicio1.model.Calificacion;

import java.util.List;

public interface ICalificacionService {

    List<Calificacion> listarCalificacionesDeEstudiante(String numMatricula);

    List<CalificacionDTO> findAll ();

    void inicializarCalificaciones();
}
