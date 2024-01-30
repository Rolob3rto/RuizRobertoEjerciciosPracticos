package com.roberto.Clase1Ejercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class GeneradorDatosController {
    @GetMapping
    public String datosCuriosos() {
        List<String> datos = List.of(
                "Los pingüinos son aves pero no vuelan, son excelentes nadadores",
                "Las abejas pueden reconocer rostros humanos",
                "Los pulpos tienen tres corazones y azul sangre",
                "Los elefantes son capaces de recordar y reconocer a otros elefantes incluso después de muchos años",
                "Los koalas tienen huellas dactilares parecidas a las humanas");

        int index = ThreadLocalRandom.current().nextInt(datos.size());

        return datos.get(index);
    }
}
