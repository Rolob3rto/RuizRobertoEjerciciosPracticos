

package com.mycompany.ejercicio2clase2;

import java.util.Scanner;


public class Ejercicio2Clase2 {

    public static void main(String[] args) {
         /*
       Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.
       Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar. Luego,
       muestra el total de la compra que debe abonar.
         */

        double product = 0;
        double total = 0;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.print("Introduce el precio del producto (0 para terminar): ");
            product = sc.nextDouble();
            if (product > 0){
                total += product;
            }
        } while (product > 0);

        System.out.println("\nEl total de tu compra es: " + total);
    }
}
