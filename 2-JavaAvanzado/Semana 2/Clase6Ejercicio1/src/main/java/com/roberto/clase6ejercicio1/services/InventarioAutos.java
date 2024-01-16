
package com.roberto.clase6ejercicio1.services;

import com.roberto.clase6ejercicio1.model.Auto;
import java.util.ArrayList;
import java.util.List;


public class InventarioAutos {
    private List<Auto> inventario;

    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }
  
    public <T extends Auto> void agregarAuto(T auto) {
        inventario.add(auto);
    }
    
    public <T extends Auto> List<T> buscarPorMarca(String marca) {
        List<T> resultado = new ArrayList<>();
        for (Auto auto : inventario) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                resultado.add((T) auto);
            }
        }
        return resultado;
    }
  
    public <T extends Auto> List<T> buscarPorAnio(int anio) {
        List<T> resultado = new ArrayList<>();
        for (Auto auto : inventario) {
            if (auto.getAnio()== anio) {
                resultado.add((T) auto);
            }
        }
        return resultado;
    }
    
    public <T extends Auto> double calcularValorTotal() {
        double valorTotal = 0;
        for (Auto auto : inventario) {
            valorTotal += auto.getPrecio();
        }
        return valorTotal;
    }
}
