
package com.mycompany.ejercicio1clase2;

import java.util.Scanner;


public class Ejercicio1Clase2 {

    public static void main(String[] args) {
        /*
        Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que,
        a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona
        puede o no ingresar al evento. El programa debe mostrar (según cada caso) un mensaje informando la situación.
         */

        int age = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");

        age = sc.nextInt();

        if (age > 18) {
            System.out.println("Puede entrar al recital");
        } else {
            System.out.println("No puede entrar a el recital");
        }
    }
}
