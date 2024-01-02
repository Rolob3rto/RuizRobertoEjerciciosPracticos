
package com.roberto.clase1ejercicio1;

import com.roberto.clase1ejercicio1.exceptions.ReservaInvalidaException;
import com.roberto.clase1ejercicio1.model.Vuelo;

public class Clase1Ejercicio1 {

    public static void main(String[] args) {
         try {
            
            Vuelo vuelo = new Vuelo("Barcelona", "2024-01-10", 50);

            
            vuelo.realizarReserva("Juan", 3);

            
            vuelo.realizarReserva("Maria", 60);

         
            vuelo.realizarReserva("", 2);
        } catch (ReservaInvalidaException e) {
            System.out.println("Error de reserva: " + e.getMessage());
        }
    }
}
