package com.roberto.Clase2Ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    @GetMapping("/convertirCmAMetros")
    public String convertirCmAMetros(@RequestParam("centimetros") double centimetros) {

        double metros = centimetros / 100;

        String mensaje = String.format("El equivalente a %.2f cm es de %.2f metros", centimetros, metros);

        return mensaje;
    }

    //localhost:8080/convertirCmAMetros?centimetros=163

}
