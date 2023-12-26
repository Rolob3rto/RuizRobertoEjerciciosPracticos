
package com.mycompany.ejercicio3semana1;

import java.util.Scanner;

public class Ejercicio3Clase1 {

    public static void main(String[] args) {
         /*
        Escribe un programa que permita calcular el área de un triángulo y luego mostrar el
        resultado por pantalla.. Recuerda que la fórmula para calcular esto es: (base * altura) / 2
        (base por altura dividido dos).
         */

        float base;
        float altura;
        float area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la base del triangulo: ");

        base = sc.nextFloat();

        System.out.println("Ingrese la altura: ");

        altura = sc.nextFloat();

        area = (base * altura) / 2;

        System.out.println("\nEl area es: " + area);
    }
}
