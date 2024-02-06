package com.roberto.Clase5Ejercicio1.dto;

import com.roberto.Clase5Ejercicio1.model.Calificacion;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CalificacionDTO {
    private Calificacion calificacion;
    private String nombreEstudiante;

    public CalificacionDTO(Calificacion calificacion, String nombreEstudiante) {
        this.calificacion = calificacion;
        this.nombreEstudiante = nombreEstudiante;
    }


}
