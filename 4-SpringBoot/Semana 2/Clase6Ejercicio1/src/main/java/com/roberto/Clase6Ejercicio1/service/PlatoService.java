package com.roberto.Clase6Ejercicio1.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.roberto.Clase6Ejercicio1.dto.PlatoDTO;
import com.roberto.Clase6Ejercicio1.dto.PlatoJsonDTO;
import com.roberto.Clase6Ejercicio1.model.Ingrediente;
import com.roberto.Clase6Ejercicio1.model.Plato;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class PlatoService implements IPlatoService {

    private final List<PlatoDTO> listaPlatosDTO = new ArrayList<>();

    @PostConstruct
    public void inicializarPlatos(){
        List<Ingrediente> listaIngredientes = loadDataBase1();
        List<PlatoJsonDTO> listaPlatos = loadDataBase2();

        listaPlatos.forEach(plato -> {
            PlatoDTO platoDTO = new PlatoDTO();
            platoDTO.setId(plato.getId());
            platoDTO.setNombrePlato(plato.getNombre());

            List<Ingrediente> resultadoLista = buscarIngredientesPorId(plato.getIngredientes(), listaIngredientes);

            platoDTO.setListaIngredientes(resultadoLista);

            platoDTO.setCantCalorias();
            platoDTO.setIngredienteMaxCalorias();

            listaPlatosDTO.add(platoDTO);
        });
    }


    @Override
    public PlatoDTO findPlato(String nombre) {
        return listaPlatosDTO.stream()
                .filter(platoDTO -> Objects.equals(platoDTO.getNombrePlato(), nombre))
                .findFirst().orElse(null);
    }

    public static List<Ingrediente> buscarIngredientesPorId(List<Long> listaIds, List<Ingrediente> listaIngredientes) {
        List<Ingrediente> resultado = new ArrayList<>();

        for (long id : listaIds) {
            for (Ingrediente ingrediente : listaIngredientes) {
                if (ingrediente.getId() == id) {
                    resultado.add(ingrediente);
                    break;
                }
            }
        }

        return resultado;
    }

    private List<Ingrediente> loadDataBase1() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("classpath:ingredients.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Ingrediente>> typeRef = new TypeReference<>() {};
        List<Ingrediente> ingrediente= null;
        try {
            ingrediente= objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingrediente;
    }

    private List<PlatoJsonDTO> loadDataBase2() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("classpath:dishes.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PlatoJsonDTO>> typeRef = new TypeReference<>() {};
        List<PlatoJsonDTO> plato= null;
        try {
            plato= objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return plato;
    }

}
