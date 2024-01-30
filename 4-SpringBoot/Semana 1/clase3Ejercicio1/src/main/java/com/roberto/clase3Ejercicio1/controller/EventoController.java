package com.roberto.clase3Ejercicio1.controller;

import com.roberto.clase3Ejercicio1.model.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private final List<Evento> eventos = new ArrayList<>();

    @GetMapping
    public List<Evento> obtenerEventos() {

        return eventos;
    }

    @GetMapping("/{id}")
    public Evento obtenerEventoPorId(@PathVariable int id) {

        return eventos.stream()
                .filter(evento -> evento.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping("/crear")
    public void crearEvento(@RequestBody Evento nuevoEvento) {

        eventos.add(nuevoEvento);
    }
}