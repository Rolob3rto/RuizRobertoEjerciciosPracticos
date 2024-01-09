package com.roberto.clase3y5ejercicio2.model;

import java.time.LocalDateTime;

public class Evento {

    private String nombre;
    private LocalDateTime fecha;
    private String categoria;

    public Evento(String nombre, LocalDateTime fecha, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Evento{" + "nombre = " + nombre + ", fecha = " + fecha + ", categoria = " + categoria + "}\n";
    }
    
    
}
