
package com.mycompany.ejercicio1clase5;

import com.mycompany.ejercicio1clase5.model.Mamifero;
import com.mycompany.ejercicio1clase5.model.Ave;
import com.mycompany.ejercicio1clase5.model.Reptil;
import com.mycompany.ejercicio1clase5.model.Animal;

public class Main {

    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero(4, "sexual", "marron", "bosque", 1, "perro", 6, "pelo", "omnivoro");
        Ave ave = new Ave(10.6, "planear", "blanco", "recto", 2, "gallina", 1, "pluma", "omnivoro");
        Reptil reptil = new Reptil(180, "alargada", "sin veneno", "rio", 3, "Caiman", 2, "dura", "carnivoro");
        
        // c)
        mamifero.Saludar();
        ave.Saludar();
        reptil.Saludar();      
               
        // d)
        Animal animal = mamifero;              
        
        animal.Saludar();
        
        // e) Si se pone en privado no se puede acceder desde fuera
    }
}
