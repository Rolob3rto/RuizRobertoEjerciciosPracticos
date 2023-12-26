
package com.mycompany.ejercicio2semana1;

public class Ejercicio2Clase1 {

    public static void main(String[] args) {
        // a)
        int number = 1;
        double number2 = 2.0;
        boolean number3 = true;
        String word = "palabra";

        System.out.println("int => " + number);
        System.out.println("double => " + number2);
        System.out.println("boolean => " + number3);
        System.out.println("String => " + word + "\n");

        // b)

        // da errores en los 2 casos y la solucion es o pasarlo a string en el caso del entero
        // o simplemente no pasarle un tipo de dato que no es, tambien se podria controlar que
        // tipo de dato esta recibiendo la variable para no admitir valores erroneos

        //String enteroEnString = 1;
        //double stringEnDouble = "asd";
    }
}
