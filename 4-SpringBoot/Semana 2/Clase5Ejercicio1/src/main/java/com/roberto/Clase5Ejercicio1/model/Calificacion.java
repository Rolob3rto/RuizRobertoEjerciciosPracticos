package com.roberto.Clase5Ejercicio1.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Calificacion {

    private int id;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    private Estudiante estudiante;

    public Calificacion(int id, double calificacion1, double calificacion2, double calificacion3, Estudiante estudiante) {
        this.id = id;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
        this.estudiante = estudiante;
        calcularPromedio();
    }

    private void calcularPromedio() {
        this.promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;
    }

    public void setCalificacion1(double calificacion1) {
        this.calificacion1 = calificacion1;
        calcularPromedio();
    }

    public void setCalificacion2(double calificacion2) {
        this.calificacion2 = calificacion2;
        calcularPromedio();
    }

    public void setCalificacion3(double calificacion3) {
        this.calificacion3 = calificacion3;
        calcularPromedio();
    }

}
