package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Accion a;

    @BeforeAll public static void setUp() {
        a = new Accion("L3R", "Refresco Rojo y Refrescante", 200, 180);
    }

    @Test public void testSimbolo() {
        assertTrue(a.getSimbolo().equals("L3R"));
    }

    @Test public void testPrecioCierrePrevio() {
        assertTrue(a.getPrecioCierrePrevio()==200.0);
    }

    @Test public void testPrecioActual() {
        assertTrue(a.getPrecioActual()==180.0);
    }

    @Test public void testPorcentajeCambio() {
        assertTrue(a.getPorcentajeCambio()==-10.0);
    }

}