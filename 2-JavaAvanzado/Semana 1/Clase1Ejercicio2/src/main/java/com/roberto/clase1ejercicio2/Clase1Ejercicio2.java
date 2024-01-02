

package com.roberto.clase1ejercicio2;

import com.roberto.clase1ejercicio2.exceptions.InventarioException;

public class Clase1Ejercicio2 {

    public static void main(String[] args) throws InventarioException {
         try {            
            agregarProducto("Producto1", 10.5, 50);
            venderProducto("Producto1", 20);

        } catch (InventarioException.CantidadInvalidaException e) {
            System.out.println("Error de cantidad: " + e.getMessage());

        } catch (InventarioException.StockInsuficienteException e) {
            System.out.println("Error de stock insuficiente: " + e.getMessage());

        } catch (InventarioException.NombreInvalidoException e) {
            System.out.println("Error de nombre inválido: " + e.getMessage());

        } catch (InventarioException.PrecioInvalidoException e) {
            System.out.println("Error de precio inválido: " + e.getMessage());
        }
    }

    private static void agregarProducto(String nombre, double precio, int cantidadDisponible) throws InventarioException {
       if (nombre == null || nombre.isEmpty()) {
            throw new InventarioException.NombreInvalidoException("El nombre del producto no puede estar vacío");
        }

        if (precio <= 0) {
            throw new InventarioException.PrecioInvalidoException("El precio del producto debe ser mayor que 0");
        }

        if (cantidadDisponible < 0) {
            throw new InventarioException.CantidadInvalidaException("La cantidad disponible no puede ser negativa");
        }
        
        System.out.println("El producto " + nombre + " se ha añadido");
    }
    
    private static void venderProducto(String nombre, int cantidad) throws InventarioException {
        if (cantidad <= 0) {
            throw new InventarioException.CantidadInvalidaException("La cantidad vendida debe ser mayor que cero");
        }
       
        System.out.println("Venta realizada de " + cantidad + " unidades de " + nombre + ".");
    }
}
