package com.davante.ej13;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.davante.app.ej13.Main;

public class MainTest {
    @Test
    public void shouldBePrimeNumber() {
        assertTrue(Main.esPrimo(2));
        assertTrue(Main.esPrimo(3));
        assertTrue(Main.esPrimo(5));
        assertTrue(Main.esPrimo(7));
        assertTrue(Main.esPrimo(11));
        assertTrue(Main.esPrimo(13));
        assertTrue(Main.esPrimo(17));
        assertTrue(Main.esPrimo(19));
    }

    @Test
    public void shouldNotBePrimeNumber() {
        assertFalse(Main.esPrimo(4));
        assertFalse(Main.esPrimo(6));
        assertFalse(Main.esPrimo(8));
        assertFalse(Main.esPrimo(9));
        assertFalse(Main.esPrimo(10));
        assertFalse(Main.esPrimo(14));
        assertFalse(Main.esPrimo(15));
        assertFalse(Main.esPrimo(16));
    }
}
