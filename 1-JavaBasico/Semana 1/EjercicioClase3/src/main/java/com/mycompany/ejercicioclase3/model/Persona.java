
package com.mycompany.ejercicioclase3.model;

public class Persona {
     private int id, edad;
    private String nombre, direccion, numero;

    public Persona() {
    }

    public Persona(int id, int edad, String nombre, String direccion, String numero) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
