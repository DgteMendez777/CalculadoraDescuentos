package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescuentosTest {

    @Test
    void testDescuentoNormal() {
        assertEquals(90.0, CalculadoraDescuentos.calcularPrecioFinal(100, 10));
    }

    @Test
    void testSinDescuento() {
        assertEquals(100.0, CalculadoraDescuentos.calcularPrecioFinal(100, 0));
    }

    @Test
    void testDescuentoTotal() {
        assertEquals(0.0, CalculadoraDescuentos.calcularPrecioFinal(100, 100));
    }

    @Test
    void testRedondeo() {
        assertEquals(66.67, CalculadoraDescuentos.calcularPrecioFinal(100, 33.333));
    }

    @Test
    void testPrecioInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraDescuentos.calcularPrecioFinal(0, 10);
        });
    }

    @Test
    void testDescuentoInvalidoMayor() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraDescuentos.calcularPrecioFinal(100, 150);
        });
    }

    @Test
    void testDescuentoInvalidoMenor() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraDescuentos.calcularPrecioFinal(100, -5);
        });
    }
}