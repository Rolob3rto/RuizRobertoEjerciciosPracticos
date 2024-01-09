package com.roberto.clase3y5ejercicio1;

import com.roberto.clase3y5ejercicio1.model.Empleado;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Clase3y5Ejercicio1 {

    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Juan", 50000, "Desarrollador"),
                new Empleado("María", 60000, "Analista"),
                new Empleado("Carlos", 80000, "Gerente"),
                new Empleado("Laura", 70000, "Desarrollador"),
                new Empleado("Pedro", 75000, "Analista"),
                new Empleado("Ana", 90000, "Gerente")
        );

        // Filtrar empleados por su salario (mayor a x valor)
        double salarioMinimo = 70000;
        List<Empleado> empleadosFiltrados = filtrarPorSalario(empleados, salarioMinimo);
        System.out.println("Empleados con salario mayor a " + salarioMinimo + ": " + empleadosFiltrados);

        // Calcular salario promedio para cada categoría
        Map<String, Double> salarioPromedio = salarioPromedioPorCategoria(empleados);
        System.out.println("Salario promedio por categoría: " + salarioPromedio);

        // Empleado con salario mas alto
        Optional<Empleado> empleadoConSalarioMaximo = empleadoSalarioMax(empleados);
        empleadoConSalarioMaximo.ifPresent(empleado -> System.out.println("Empleado con salario mas alto: " + empleado.getNombre() + " - " + empleado.getSalario()));
    }

    private static List<Empleado> filtrarPorSalario(List<Empleado> empleados, double salarioMinimo) {
        return empleados.stream()
                .filter(empleado -> empleado.getSalario() > salarioMinimo)
                .collect(Collectors.toList());
    }

    private static Map<String, Double> salarioPromedioPorCategoria(List<Empleado> empleados) {
        return empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)));
    }

    private static Optional<Empleado> empleadoSalarioMax(List<Empleado> empleados) {
        return empleados.stream()
                .max((salario1, salario2) -> Double.compare(salario1.getSalario(), salario2.getSalario()));
    }
    
    
}
