package com.roberto.Clase6Ejercicio1.model;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Plato {

    private long id;
    private String nombre;
    private List<Ingrediente> ingredientes;

}
