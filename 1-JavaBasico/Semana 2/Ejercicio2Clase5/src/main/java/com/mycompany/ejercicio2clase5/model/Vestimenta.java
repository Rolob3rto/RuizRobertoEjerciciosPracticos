
package com.mycompany.ejercicio2clase5.model;

public class Vestimenta {
     
    private int codigo;
    private String nombre;
    private double precio;
    private String marca;
    private int talla;
    private String color;

    public Vestimenta() {
    }

    public Vestimenta(int codigo, String nombre, double precio, String marca, int talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vestimenta{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + ", talla=" + talla + ", color=" + color + '}';
    }
  
    public void mensaje() {        
    }
}
