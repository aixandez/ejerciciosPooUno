package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import remera.Remera;
import remera.Talle;

public class RemeraTest {
	
	@Test
	public void testTallePequeño() {
		Remera remera = new Remera();
		remera.setTalle(Talle.PEQUEÑO);
		assertEquals(Talle.PEQUEÑO, remera.getTalle());
	}

	@Test
	public void testTalleMediano() {
        Remera remera = new Remera();
        remera.setTalle(Talle.MEDIANO);
        assertEquals(Talle.MEDIANO, remera.getTalle());
    }
	
	@Test
	public void testTalleGrande() {
		Remera remera = new Remera();
		remera.setTalle(Talle.GRANDE);
		assertEquals(Talle.GRANDE, remera.getTalle());
	}

}
