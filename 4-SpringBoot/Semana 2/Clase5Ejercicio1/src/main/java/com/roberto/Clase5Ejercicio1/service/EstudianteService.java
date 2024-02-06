package com.roberto.Clase5Ejercicio1.service;

import com.roberto.Clase5Ejercicio1.model.Estudiante;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteService implements IEstudianteService{

    private final List<Estudiante> listaEstudiantes = new ArrayList<>();

    @PostConstruct
    public void inicializarEstudiantes(){

        Estudiante estudiante1 = new Estudiante(1,"1234R", "Juan", "Perez", LocalDate.of(2000, 1, 1));
        Estudiante estudiante2 = new Estudiante(2,"4567L", "Ana", "Gomez", LocalDate.of(2001, 2, 2));
        Estudiante estudiante3 = new Estudiante(3,"8901P", "Carlos", "Rodriguez", LocalDate.of(2002, 3, 3));
        Estudiante estudiante4 = new Estudiante(4,"2345U", "Laura", "Lopez", LocalDate.of(2003, 4, 4));
        Estudiante estudiante5 = new Estudiante(5,"6789T", "Miguel", "Fernandez", LocalDate.of(2004, 5, 5));


        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);
        listaEstudiantes.add(estudiante4);
        listaEstudiantes.add(estudiante5);
    }
    @Override
    public List<Estudiante> listarEstudiantes() {

        return listaEstudiantes;
    }
}
