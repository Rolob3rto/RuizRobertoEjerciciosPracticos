package com.roberto.Clase1Ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class RefraneroController {

    @GetMapping
    public String refranes() {

        List<String> refranes = new ArrayList<String>();

        refranes.add("A caballo regalado no le inspecciones los dientes");
        refranes.add("A divinidad implorando y con la herramienta actuando");
        refranes.add("Al adversario que escapa, puente de oro");
        refranes.add("En la senectud, erupciones cutáneas");
        refranes.add("A expresiones insensatas, órganos auditivos impermeables");
        refranes.add("Quien se levanta temprano, recibe asistencia divina");
        refranes.add("A monarca difunto, monarca sucesor");


        int index = ThreadLocalRandom.current().nextInt(refranes.size());

        return refranes.get(index);
    }
}
