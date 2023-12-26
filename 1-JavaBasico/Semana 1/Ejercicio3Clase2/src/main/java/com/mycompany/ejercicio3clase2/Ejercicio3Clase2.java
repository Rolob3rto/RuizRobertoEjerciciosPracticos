
package com.mycompany.ejercicio3clase2;

import java.util.Scanner;

public class Ejercicio3Clase2 {

    public static void main(String[] args) {
        
        /*
        Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.

        Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día. Una vez almacenadas
         las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.
         */

        double[] tempArray = new double[7];
        String[] days = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        double average = 0;
        double total = 0;

        double temp;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tempArray.length; i++) {
            System.out.print("Ingresa la temperatura que hizo el " + days[i] + ": ");
            temp = sc.nextDouble();

            total += temp;
        }

        average = total / tempArray.length;

        System.out.print("\nEl promedio es: " + average);
    }
}
