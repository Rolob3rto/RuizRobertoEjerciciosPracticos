
package com.roberto.clase1ejercicio1.model;

import com.roberto.clase1ejercicio1.exceptions.ReservaInvalidaException;

public class Vuelo {
    private String destino;
    private String fecha;
    private int asientosDisponibles;

    public Vuelo() {
    }

    public Vuelo(String destino, String fecha, int asientosDisponibles) {
        this.destino = destino;
        this.fecha = fecha;
        this.asientosDisponibles = asientosDisponibles;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "destino = " + destino + ", fecha = " + fecha + ", asientosDisponibles = " + asientosDisponibles + '}';
    }
    
     public void realizarReserva(String nombre, int numAsientos) throws ReservaInvalidaException {
        if (nombre == null || nombre.isEmpty() || numAsientos <= 0) {
            throw new ReservaInvalidaException("Por favor, proporcione datos válidos para la reserva");
        }

        if (numAsientos > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos para la reserva");
        }                 

        asientosDisponibles -= numAsientos;
        System.out.println("Reserva exitosa para " + nombre + " en vuelo a " + destino + " el dia " + fecha);
    }
    
    
}
