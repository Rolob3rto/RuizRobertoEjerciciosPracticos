
package com.mycompany.ejercicio1clase6.model;

import java.time.LocalDate;

public class Camioneta extends Vehiculo implements Combustion{
     
    private int capacidadTanque;
    private int consumoCombustible;

    public Camioneta() {
    }

    public Camioneta(int id, String placa, String marca, String modelo, int anio, int costo, int capacidadTanque, int consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
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
