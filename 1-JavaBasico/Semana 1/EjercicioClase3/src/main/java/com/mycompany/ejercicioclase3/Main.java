
package com.mycompany.ejercicioclase3;

import com.mycompany.ejercicioclase3.model.Electrodomestico;
import com.mycompany.ejercicioclase3.model.Persona;

public class Main {

    public static void main(String[] args) {
         //Main 1

        Electrodomestico elect1 = new Electrodomestico("cod1", "marca1", "modelo1", 2.1, "naranja");
        Electrodomestico elect2 = new Electrodomestico("cod2", "marca2", "modelo2", 2.4, "naranja");
        Electrodomestico elect3 = new Electrodomestico("cod3", "marca3", "modelo3", 2.9, "rojo");
        Electrodomestico elect4 = new Electrodomestico();

        System.out.println(elect1);
        System.out.println(elect2);
        System.out.println(elect3);
        System.out.println(elect4.getMarca());

        //Main 2

        Persona[] personas = new Persona[5];

        personas[0] = new Persona(1, 12, "nombre1", "direccion1", "123456789");
        personas[1] = new Persona(2, 17, "nombre2", "direccion2", "123544567");
        personas[2] = new Persona(3, 32, "nombre3", "direccion3", "123654789");
        personas[3] = new Persona(4, 22, "nombre4", "direccion4", "946721345");
        personas[4] = new Persona(5, 41, "nombre5", "direccion5", "129456789");

        for (Persona persona : personas){
            System.out.println("Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());
        }
        System.out.println("\n---------\n");

        personas[0].setNombre("nombreCambiado1");
        personas[1].setNombre("nombreCambiado2");

        for (Persona persona : personas){
            System.out.println("Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());
        }

        System.out.println("\n---------\n");

        for (Persona persona : personas){
            if (persona.getEdad() > 30){
                System.out.println("Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());
            }
        }
    }
}
