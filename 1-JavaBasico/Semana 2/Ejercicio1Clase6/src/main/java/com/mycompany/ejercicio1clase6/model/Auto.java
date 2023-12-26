package com.mycompany.ejercicio1clase6.model;

import java.time.LocalDate;

public class Auto extends Vehiculo implements Electrico {

    private int capacidadBateria;
    private int autonomia;

    public Auto() {
    }

    public Auto(int id, String placa, String marca, String modelo, int anio, int costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    @Override
    public int calcularAntiguedad() {
        return (LocalDate.now().getYear() - this.getAnio());
      
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Recargando electricidad");
    }
}
