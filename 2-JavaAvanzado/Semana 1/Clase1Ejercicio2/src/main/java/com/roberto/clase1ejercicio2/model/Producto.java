
package com.roberto.clase1ejercicio2.model;

import com.roberto.clase1ejercicio2.exceptions.InventarioException;
import com.roberto.clase1ejercicio2.exceptions.InventarioException.CantidadInvalidaException;
import com.roberto.clase1ejercicio2.exceptions.InventarioException.NombreInvalidoException;
import com.roberto.clase1ejercicio2.exceptions.InventarioException.PrecioInvalidoException;
import com.roberto.clase1ejercicio2.exceptions.InventarioException.StockInsuficienteException;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
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

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre = " + nombre + ", precio = " + precio + ", cantidadDisponible = " + cantidadDisponible + '}';
    }
    
    public void venderProducto(int cantidad) throws InventarioException {
        if (cantidad <= 0) {
            throw new CantidadInvalidaException("La cantidad vendida debe ser mayor que cero");
        }

        if (cantidad > cantidadDisponible) {
            throw new StockInsuficienteException("No hay suficiente stock para vender " + cantidad + " unidades de " + nombre);
        }
     
        cantidadDisponible -= cantidad;
        System.out.println("Venta exitosa de " + cantidad + " unidades de " + nombre);
    }
    
     public void agregarProducto(String nombre, double precio, int cantidadDisponible) throws InventarioException {
        if (nombre == null || nombre.isEmpty()) {
            throw new NombreInvalidoException("El nombre del producto no puede estar vacio");
        }

        if (precio <= 0) {
            throw new PrecioInvalidoException("El precio del producto debe ser mayor que cero");
        }

        if (cantidadDisponible < 0) {
            throw new CantidadInvalidaException("La cantidad disponible no puede ser negativa");
        }
        
        Producto nuevoProducto = new Producto(nombre, precio, cantidadDisponible);        
        System.out.println("Producto agregado al inventario: " + nuevoProducto.getNombre());
    }
}
