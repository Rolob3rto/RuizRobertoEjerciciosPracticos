package com.roberto.clase3y5ejercicio2;

import com.roberto.clase3y5ejercicio2.model.Evento;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Clase3y5Ejercicio2 {

    public static void main(String[] args) {
        List<Evento> eventos = Arrays.asList(
                new Evento("Reunión equipo", LocalDateTime.of(2024, 1, 10, 14, 0), "Reunión"),
                new Evento("Conferencia Java", LocalDateTime.of(2024, 1, 15, 10, 30), "Conferencia"),
                new Evento("Taller de desarrollo", LocalDateTime.of(2024, 1, 20, 16, 0), "Taller"),
                new Evento("Reunión clientes", LocalDateTime.of(2024, 1, 12, 12, 0), "Reunión"),
                new Evento("Conferencia Agile", LocalDateTime.of(2024, 1, 18, 11, 0), "Conferencia"),
                new Evento("Taller de testing", LocalDateTime.of(2024, 1, 25, 15, 30), "Taller")
        );

        // Filtrar los eventos por una fecha
        LocalDate fechaEspecifica = LocalDate.of(2024, 1, 15);
        List<Evento> eventosEnFechaEspecifica = filtrarPorFecha(eventos, fechaEspecifica);
        System.out.println("Eventos programados para el " + fechaEspecifica + ": " + eventosEnFechaEspecifica);

        // Agrupar los eventos por categoría y contar cuantos hay
        Map<String, Long> eventosPorCategoria = contarEventosPorCategoria(eventos);
        System.out.println("Cantidad de eventos por categoría: " + eventosPorCategoria);

        // Encuentrar el evento más próximo
        Optional<Evento> eventoMasProximo = eventoMasProximo(eventos);
        eventoMasProximo.ifPresent(evento
                -> System.out.println("Evento más próximo: " + evento.getNombre() + " - " + evento.getFecha()));
    }

    private static List<Evento> filtrarPorFecha(List<Evento> eventos, LocalDate fechaEspecifica) {
        return eventos.stream()
                .filter(evento -> evento.getFecha().toLocalDate().equals(fechaEspecifica))
                .collect(Collectors.toList());
    }

    private static Map<String, Long> contarEventosPorCategoria(List<Evento> eventos) {
        return eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria,
                        Collectors.counting()));
    }

    private static Optional<Evento> eventoMasProximo(List<Evento> eventos) {
        return eventos.stream()
                .min((ev1, ev2) -> ev1.getFecha().compareTo(ev2.getFecha()));
    }

}
