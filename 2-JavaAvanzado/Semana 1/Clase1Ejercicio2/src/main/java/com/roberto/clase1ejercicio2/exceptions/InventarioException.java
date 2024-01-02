package com.roberto.clase1ejercicio2.exceptions;

public class InventarioException extends Exception {

    public InventarioException(String mensaje) {
        super(mensaje);
    }

    public static class CantidadInvalidaException extends InventarioException {

        public CantidadInvalidaException(String mensaje) {
            super(mensaje);
        }
    }

    public static class StockInsuficienteException extends InventarioException {

        public StockInsuficienteException(String mensaje) {
            super(mensaje);
        }
    }

    public static class NombreInvalidoException extends InventarioException {

        public NombreInvalidoException(String mensaje) {
            super(mensaje);
        }
    }

    public static class PrecioInvalidoException extends InventarioException {

        public PrecioInvalidoException(String mensaje) {
            super(mensaje);
        }
    }
}
