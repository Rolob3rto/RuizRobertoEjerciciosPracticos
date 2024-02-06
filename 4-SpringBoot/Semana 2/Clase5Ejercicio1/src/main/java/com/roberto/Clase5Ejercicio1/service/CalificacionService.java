package com.roberto.Clase5Ejercicio1.service;

import com.roberto.Clase5Ejercicio1.dto.CalificacionDTO;
import com.roberto.Clase5Ejercicio1.model.Calificacion;
import com.roberto.Clase5Ejercicio1.model.Estudiante;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalificacionService implements ICalificacionService {

    private final List<Calificacion> listaCalificaciones = new ArrayList<>();

    @PostConstruct
    public void inicializarCalificaciones(){

        Estudiante estudiante1 = new Estudiante(1,"1234R", "Juan", "Perez", LocalDate.of(2000, 1, 1));
        Estudiante estudiante2 = new Estudiante(2,"4567L", "Ana", "Gomez", LocalDate.of(2001, 2, 2));
        Estudiante estudiante3 = new Estudiante(3,"8901P", "Carlos", "Rodriguez", LocalDate.of(2002, 3, 3));
        Estudiante estudiante4 = new Estudiante(4,"2345U", "Laura", "Lopez", LocalDate.of(2003, 4, 4));
        Estudiante estudiante5 = new Estudiante(5,"6789T", "Miguel", "Fernandez", LocalDate.of(2004, 5, 5));

        Calificacion calificacion1 = new Calificacion(1, 8.5, 9.0, 7.5, estudiante1);
        Calificacion calificacion2 = new Calificacion(2, 7.0, 8.5, 9.0, estudiante2);
        Calificacion calificacion3 = new Calificacion(3, 9.5, 8.0, 7.0, estudiante3);
        Calificacion calificacion4 = new Calificacion(4, 6.0, 7.5, 8.5, estudiante4);
        Calificacion calificacion5 = new Calificacion(5, 8.0, 9.0, 9.5, estudiante5);

        listaCalificaciones.add(calificacion1);
        listaCalificaciones.add(calificacion2);
        listaCalificaciones.add(calificacion3);
        listaCalificaciones.add(calificacion4);
        listaCalificaciones.add(calificacion5);
    }

    @Override
    public List<Calificacion> listarCalificacionesDeEstudiante(String numMatricula) {

        return listaCalificaciones.stream()
                .filter(calificacion -> calificacion.getEstudiante().getNumMatricula().equals(numMatricula))
                .collect(Collectors.toList());
    }

    @Override
    public List<CalificacionDTO> findAll() {

        return listaCalificaciones.stream()
                .sorted(Comparator.comparingDouble(Calificacion::getPromedio).reversed())
                .map(calificacion -> new CalificacionDTO(calificacion, calificacion.getEstudiante().getNombre()))
                .collect(Collectors.toList());
    }
}
