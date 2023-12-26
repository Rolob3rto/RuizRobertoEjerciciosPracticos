package com.mycompany.ejercicio1clase6;

import com.mycompany.ejercicio1clase6.model.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Auto auto1 = new Auto(1, "9876XYZ", "Ferrari", "LaFerrari", 2022, 70000, 11000, 8);
        Auto auto2 = new Auto(4, "5432ABC", "Lamborghini", "Huracan", 2023, 120000, 13000, 9);

        Camioneta camioneta1 = new Camioneta(3, "8642JKL", "Jeep", "Wrangler", 2010, 40000, 70, 10);
        Camioneta camioneta2 = new Camioneta(5, "1234MNO", "Land Rover", "Defender", 2019, 65000, 80, 12);

        Moto moto1 = new Moto(2, "5678PQR", "Ducati", "Panigale V4", 2020, 15000, 1100, "4 tiempos");
        Moto moto2 = new Moto(6, "4321STU", "Kawasaki", "Ninja H2", 2021, 18000, 1200, "4 tiempos");

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(auto1);
        vehiculos.add(auto2);
        vehiculos.add(camioneta1);
        vehiculos.add(camioneta2);
        vehiculos.add(moto1);
        vehiculos.add(moto2);

        for (Vehiculo vehiculo : vehiculos) {

            System.out.println("\nID: " + vehiculo.getId());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Año: " + vehiculo.getAnio());
            System.out.println("Costo: " + vehiculo.getCosto());
            System.out.println("Antigüedad (anios): " + vehiculo.calcularAntiguedad());
            System.out.println("Tipo de vehiculo: " + vehiculo.getClass().getSimpleName() + "\n");

            if (vehiculo instanceof Electrico electrico) {
                electrico.cargarEnergia();
            } else if (vehiculo instanceof Combustion combustion) {
                combustion.llenarCombustible();
            }

        }
    }
}
