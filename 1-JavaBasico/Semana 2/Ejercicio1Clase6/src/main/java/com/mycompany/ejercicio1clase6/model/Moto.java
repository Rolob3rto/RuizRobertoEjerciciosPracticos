package com.mycompany.ejercicio1clase6.model;

import java.time.LocalDate;

public class Moto extends Vehiculo implements Combustion {

    private int cilindrada;
    private String tipoMotor;

    public Moto() {
    }

    public Moto(int id, String placa, String marca, String modelo, int anio, int costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    @Override
    public int calcularAntiguedad() {
         return (LocalDate.now().getYear() - this.getAnio());
    }

    @Override
    public void llenarCombustible() {
        System.out.println("Llenando combustible");
    }
}
