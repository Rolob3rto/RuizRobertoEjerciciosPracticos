package com.roberto.Clase6Ejercicio1.dto;

import com.roberto.Clase6Ejercicio1.model.Ingrediente;
import lombok.*;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PlatoDTO implements Serializable {

    private long id;
    private String nombrePlato;
    private double precio;
    private List<Ingrediente> listaIngredientes;
    private int cantCalorias = 0;
    private String ingredienteMaxCalorias;

    public void setCantCalorias() {
        this.cantCalorias = listaIngredientes.stream()
                .mapToInt(Ingrediente::getCalories)
                .sum();
    }

    public void setIngredienteMaxCalorias() {
        Optional<String> nombreIngredienteConMasCalorias = listaIngredientes.stream()
                .max(Comparator.comparingInt(Ingrediente::getCalories))
                .map(Ingrediente::getName);

        this.ingredienteMaxCalorias = nombreIngredienteConMasCalorias.orElse("Null");
    }
}
