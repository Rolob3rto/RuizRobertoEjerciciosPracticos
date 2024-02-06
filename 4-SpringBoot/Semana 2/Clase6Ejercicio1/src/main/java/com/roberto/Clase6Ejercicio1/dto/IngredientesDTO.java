package com.roberto.Clase6Ejercicio1.dto;

import com.roberto.Clase6Ejercicio1.model.Ingrediente;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class IngredientesDTO implements Serializable {
    private String nombreIngrediente;
    private int cantCalorias;

}
