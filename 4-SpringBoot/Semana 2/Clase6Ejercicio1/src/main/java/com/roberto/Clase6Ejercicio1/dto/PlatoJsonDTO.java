package com.roberto.Clase6Ejercicio1.dto;

import com.roberto.Clase6Ejercicio1.model.Ingrediente;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PlatoJsonDTO {

    private long id;
    private String nombre;
    private List<Long> ingredientes;
}
