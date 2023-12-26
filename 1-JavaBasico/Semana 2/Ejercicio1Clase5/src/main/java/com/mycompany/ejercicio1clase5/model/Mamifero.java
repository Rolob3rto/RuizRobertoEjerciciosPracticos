
package com.mycompany.ejercicio1clase5.model;

public class Mamifero extends Animal {
    
    private int numPatas;
    private String tipoReproduccion;
    private String colorPelo;
    private String habitat;

    public Mamifero() {
    }

    public Mamifero(int numPatas, String tipoReproduccion, String colorPelo, String habitat, int id, String nombre, int edad, String tipoPiel, String alimentacion) {
        super(id, nombre, edad, tipoPiel, alimentacion);
        this.numPatas = numPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelo = colorPelo;
        this.habitat = habitat;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "numPatas=" + numPatas + ", tipoReproduccion=" + tipoReproduccion + ", colorPelo=" + colorPelo + ", habitat=" + habitat + '}';
    }
    
    @Override
    public void Saludar() {
        System.out.println("Hola, soy un mamífero.");
    }
}
