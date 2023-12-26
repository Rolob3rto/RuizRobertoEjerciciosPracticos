
package com.mycompany.ejercicio2clase5;

import com.mycompany.ejercicio2clase5.model.*;

public class Main {

    public static void main(String[] args) {
        Zapato zapato1 = new Zapato("cuero", "cordones", 1, "formal", 129.99, "Gentleman", 42, "cafe");
        Zapato zapato2 = new Zapato("sintético", "velcro", 2, "casual", 59.95, "UrbanStyle", 39, "azul");
        Zapato zapato3 = new Zapato("lona", "elasticos", 3, "zapatilla", 44.50, "Sporty", 41, "gris");

        Pantalon pantalon1 = new Pantalon("casual", "mezclilla", 4, "recto", 49.99, "DenimCo", 32, "azul claro");
        Pantalon pantalon2 = new Pantalon("deporte", "poliester", 5, "ajustado", 29.99, "FitFlex", 34, "negro");
        Pantalon pantalon3 = new Pantalon("formal", "lino", 6, "plisado", 79.75, "Elegance", 36, "blanco");

        Camiseta camiseta1 = new Camiseta("corta", "cuello en V", 7, "estampada", 24.80, "CoolPrints", 48, "rojo");
        Camiseta camiseta2 = new Camiseta("larga", "cuello redondo", 8, "basica", 15.00, "Essentials", 52, "blanco");

        Sombrero sombrero1 = new Sombrero("verano", "L", 9, "alon ancho", 34.95, "SunshineHats", 56, "beige");
        
        Vestimenta[] vestimentas = {zapato1, zapato2, zapato3, pantalon1, pantalon2, pantalon3, camiseta1, camiseta2, sombrero1};
        
        for (int i = 0; i < vestimentas.length; i++) {
            
            vestimentas[i].mensaje();
            
        }
    }
}
