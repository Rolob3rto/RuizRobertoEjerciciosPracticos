
package com.mycompany.ejercicio4semana1;

import java.util.Scanner;

public class Ejercicio4Clase1 {

    public static void main(String[] args) {
         /*
        Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: suma, resta,
        multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.
         */

        int num1;
        int num2;
        int suma, resta, mult;
        float div;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");

        num1 = sc.nextInt();

        System.out.println("Ingrese el numero 2: ");

        num2 = sc.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        System.out.println("\nLa suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La mult es: " + mult);
        System.out.println("La div es: " + div);
    }
}
