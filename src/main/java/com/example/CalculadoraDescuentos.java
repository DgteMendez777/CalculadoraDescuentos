package com.example;

public class CalculadoraDescuentos {

    public static double calcularPrecioFinal(double precioOriginal, double porcentajeDescuento) {

        if (precioOriginal <= 0) {
            throw new IllegalArgumentException("El precio original debe ser mayor que cero");
        }

        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El descuento debe estar entre 0 y 100");
        }

        // Casos especiales
        if (porcentajeDescuento == 0) {
            return redondear(precioOriginal);
        }

        if (porcentajeDescuento == 100) {
            return 0.0;
        }

        double descuento = precioOriginal * (porcentajeDescuento / 100);
        double precioFinal = precioOriginal - descuento;

        return redondear(precioFinal);
    }

    private static double redondear(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
}