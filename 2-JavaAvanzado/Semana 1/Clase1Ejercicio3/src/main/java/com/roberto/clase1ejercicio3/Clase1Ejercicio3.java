package com.roberto.clase1ejercicio3;

public class Clase1Ejercicio3 {

    private static int TAMANIO_VECTOR = 5;
    private static String[] vectorDatos = new String[TAMANIO_VECTOR];

    public static void main(String[] args) {

        try {
            // Almacenar datos
            almacenarDato(0, "Dato 1");
            almacenarDato(2, "Dato 2");

            // Acceder a los datos
            String dato1 = obtenerDato(0);
            String dato2 = obtenerDato(2);
                      
            String datoInvalido = obtenerDato(5);
            
            System.out.println("Dato obtenido en la posición 0: " + dato1);
            System.out.println("Dato obtenido en la posición 2: " + dato2);
            System.out.println("Dato obtenido en la posición 5: " + datoInvalido);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void almacenarDato(int indice, String dato) throws IndexOutOfBoundsException {

        if (indice < 0 || indice >= TAMANIO_VECTOR) {
            throw new IndexOutOfBoundsException("Indice fuera del rango");
        }

        vectorDatos[indice] = dato;
        System.out.println("Dato almacenado en la posición " + indice + " con: " + dato);
    }
    
    public static String obtenerDato(int indice) throws IndexOutOfBoundsException {
        
        if (indice < 0 || indice >= TAMANIO_VECTOR) {
            throw new IndexOutOfBoundsException("Indice fuera del rango del vector");
        }
        
        return vectorDatos[indice];
    }
}
