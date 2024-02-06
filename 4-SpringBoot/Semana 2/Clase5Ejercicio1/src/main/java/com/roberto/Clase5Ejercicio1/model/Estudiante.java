package com.roberto.Clase5Ejercicio1.model;


import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Estudiante {

    private int id;
    private String numMatricula;
    private String nombre;
    private String apellido;
    private LocalDate fNacimiento;

}
