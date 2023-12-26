package com.mycompany.ejercicio2clase6;

import com.mycompany.ejercicio2clase6.model.Producto;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Producto telefono = new Producto(1, "telefono", "Samsung", "Galaxy S22", 950.75, 1150.00, 15);
        Producto laptop = new Producto(2, "laptop", "HP", "Spectre x360", 1350.50, 1899.99, 10);
        Producto auriculares = new Producto(3, "auriculares", "Sony", "Noise-Cancel Pro", 49.90, 69.99, 30);
        Producto cargador = new Producto(4, "cargador", "Dell", "PowerConnect", 12.80, 24.50, 25);
        Producto tablet = new Producto(5, "tablet", "Google", "Pixel Slate", 210.25, 299.99, 18);
        Producto camara = new Producto(6, "cámara", "Canon", "EOS Rebel", 549.99, 699.95, 8);
        Producto altavoces = new Producto(7, "altavoces", "Bose", "SoundLink", 149.50, 199.99, 15);
        Producto relojDePared = new Producto(8, "reloj de pared", "Seiko", "ModernGlow", 39.95, 59.80, 10);
        Producto impresora = new Producto(9, "impresora", "Epson", "PrintMaster", 89.99, 129.50, 12);
        Producto mochila = new Producto(10, "mochila", "North Face", "Explorer", 49.75, 79.99, 20);

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(telefono);
        productos.add(laptop);
        productos.add(auriculares);
        productos.add(cargador);
        productos.add(tablet);
        productos.add(camara);
        productos.add(altavoces);
        productos.add(relojDePared);
        productos.add(impresora);
        productos.add(mochila);
       
        Producto productoMayorPrecioVenta = new Producto();
        productoMayorPrecioVenta.setPrecioVenta(0);      

        for (Producto producto : productos) {
            if (producto.getPrecioVenta() > productoMayorPrecioVenta.getPrecioVenta()) {
                productoMayorPrecioVenta = producto;
            }
        }

        System.out.println("El producto de mayor precio de venta es: " + productoMayorPrecioVenta);

        Producto productoMenorPrecioCosto = new Producto();
        productoMenorPrecioCosto.setPrecioCosto(Double.MAX_VALUE);      

        for (Producto producto : productos) {
            if (producto.getPrecioCosto() < productoMenorPrecioCosto.getPrecioCosto()) {
                productoMenorPrecioCosto = producto;
            }
        }

        System.out.println("El producto de menor precio de costo es: " + productoMenorPrecioCosto);

        productos.remove(4);

        Producto productoMayorStock = new Producto();
        productoMayorStock.setCantidadStock(0);      

        for (Producto producto : productos) {
            if (producto.getCantidadStock()> productoMayorStock.getCantidadStock()) {
                productoMayorStock = producto;
            }
        }

        System.out.println("El producto de mayor stock es: " + productoMayorStock);

        productoMayorStock.setCantidadStock((productoMayorStock.getCantidadStock() - 3));

         for (Producto producto : productos) {
            if (producto.getCantidadStock()> productoMayorStock.getCantidadStock()) {
                productoMayorStock = producto;
            }
        }
         
         System.out.println("El producto de mayor stock es: " + productoMayorStock);
    }
}
