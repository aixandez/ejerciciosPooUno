package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import ponyExpress.PonyExpress;

public class PonyExpressTest {

    @Test
       public void probarTresCaballos() {

           assertEquals(3, new PonyExpress(new int[] { 33, 8, 16, 47, 30, 30, 46 }).caballos());
       }

       @Test
       public void probarUnCaballos() {
           assertEquals(1, new PonyExpress(new int[] { 18, 15 }).caballos());
       }

       @Test
       public void probarDosCaballos() {
           assertEquals(2, new PonyExpress(new int[] { 43, 23, 40, 13 }).caballos());
       }

       @Test
       public void probarCuatroCaballos() {
           assertEquals(4,
                   new PonyExpress(new int[] { 6, 24, 6, 8, 28, 23, 47, 17, 29, 37, 18, 40, 49 }).caballos());
       }

       @Test
       public void probarInvalidaCaballos() {
           assertEquals(3, new PonyExpress(new int[] { 51, 51, 51 }).caballos());
       }

       @Test
       public void probarDistanciaInvalida() {
           assertThrows(Error.class, () -> new PonyExpress(new int[] { 23, 23, 180, 23, 32 }).caballos());
       }
       
}
