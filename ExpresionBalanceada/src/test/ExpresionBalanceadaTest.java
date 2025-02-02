package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import expresionBalanceada.ExpresionBalanceada;

public class ExpresionBalanceadaTest {
    private ExpresionBalanceada eb = new ExpresionBalanceada();

    @Test
    public void ejemploBalanceadaTest() {
        String expresion = "[()]{}{[()()]()}";
        assertTrue(eb.estaBalanceada(expresion));
    }

    @Test
    public void ejemploDesBalanceadaTest() {
        String expresion = "[(])";
        assertFalse(eb.estaBalanceada(expresion));
    }

    @Test
    public void ejemploExpresionVaciaTest() {
        String expresion = "";
        assertTrue(eb.estaBalanceada(expresion));
    }

    @Test
    public void ejemploExpresionUnSoloSimboloDeAbrirTest() {
        String expresion = "[";
        assertFalse(eb.estaBalanceada(expresion));
    }

    @Test
    public void ejemploExpresionUnSoloSimboloDeCerrarTest() {
        String expresion = "]";
        assertFalse(eb.estaBalanceada(expresion));
    }
}