package com.roberto.clase6ejercicio1;

import com.roberto.clase6ejercicio1.model.Auto;
import com.roberto.clase6ejercicio1.services.InventarioAutos;
import java.util.List;

public class Clase6Ejercicio1 {

    public static void main(String[] args) {

        InventarioAutos inventario = new InventarioAutos();

        Auto auto1 = new Auto("Toyota", "Corolla", 2022, 25000.0);
        Auto auto2 = new Auto("Honda", "Civic", 2023, 27000.0);
        Auto auto3 = new Auto("Toyota", "Camry", 2022, 30000.0);

        inventario.agregarAuto(auto1);
        inventario.agregarAuto(auto2);
        inventario.agregarAuto(auto3);

        // Buscar autos por marca
        List<Auto> toyotas = inventario.buscarPorMarca("Toyota");
        System.out.println("Autos Toyota:");
        for (Auto auto : toyotas) {
            System.out.println(auto.getMarca() + " " + auto.getModelo() + " " + auto.getAnio()+ " $" + auto.getPrecio());
        }

        // Buscar autos por año
        List<Auto> autos2022 = inventario.buscarPorAnio(2022);
        System.out.println("\nAutos del año 2022:");
        for (Auto auto : autos2022) {
            System.out.println(auto.getMarca() + " " + auto.getModelo() + " " + auto.getAnio()+ " $" + auto.getPrecio());
        }

        // Calcular el valor total del inventario
        double valorTotal = inventario.calcularValorTotal();
        System.out.println("\nValor total del inventario: $" + valorTotal);
    }

}
