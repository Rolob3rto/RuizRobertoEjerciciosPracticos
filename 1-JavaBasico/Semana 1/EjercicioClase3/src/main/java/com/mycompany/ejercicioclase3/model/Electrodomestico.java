
package com.mycompany.ejercicioclase3.model;

public class Electrodomestico {
    
    private String cod;
    private String marca;
    private String modelo;
    private double consumo;
    private String color;

    public Electrodomestico() {
    }
    public Electrodomestico(String cod, String marca, String modelo, double consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getCod() {
        return cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Electrodomestico{" +
                "cod=" + cod +
                ", marca=" + marca +
                ", modelo=" + modelo +
                ", consumo=" + consumo +
                ", color=" + color +
                '}';
    }
}
