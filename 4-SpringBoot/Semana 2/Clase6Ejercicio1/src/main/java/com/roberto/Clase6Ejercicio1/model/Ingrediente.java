package com.roberto.Clase6Ejercicio1.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Ingrediente {
    private long id;
    private String name;
    private int calories;
}
