
package com.mycompany.ejercicio2clase5.model;

public class Sombrero extends Vestimenta{
    private String tipo;
    private String tamanio;

    public Sombrero() {
    }

    public Sombrero(String tipo, String tamanio, int codigo, String nombre, double precio, String marca, int talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Sombrero{" + "tipo=" + tipo + ", tamanio=" + tamanio + '}';
    }
    
    @Override
    public void mensaje() {
        System.out.println("Este sombrero es de tipo: " + getTipo());
    }
}
