
package com.mycompany.ejercicio4clase2;

import java.util.Scanner;

public class Ejercicio4Clase2 {

    public static void main(String[] args) {
       
        char[][] butacas = new char[5][5];
        boolean salir = false;
        int fila, col;
        String reservar;

        double temp;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                butacas[i][j] = 'O';
            }
        }

        do{
            System.out.print("Ingresar numero de fila (de 0 a 4): ");
            fila = sc.nextInt();

            System.out.print("columna (de 0 a 4): ");
            col = sc.nextInt();

            if (butacas[fila][col] == 'O') {
                butacas[fila][col] = 'X';
                System.out.println("se ha reservado el asiento\n");

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(butacas[i][j]);
                    }
                    System.out.println();
                }

                System.out.println("¿Quiere seguir reservando? (S para continuar)");
                reservar = sc.next();
                reservar = reservar.toUpperCase();
                salir = reservar.equals("S");
            } else {
                System.out.println("Butaca ocupada");
            }
        }while (salir);
    }
}
