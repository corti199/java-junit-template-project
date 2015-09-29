package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.Cronometro;

public class Cronometro_Test {
	
	Cronometro c = new Cronometro();
	
	@Test
	public void test() {
	c.reiniciar();
	assertEquals("0 horas,0 minutos", c.mosTiempotrarTiempo());
	}
	
	@Test
	public void test2() {
	c.reiniciar();
	assertNotEquals("0 horas,1 minutos", c.mosTiempotrarTiempo());
	}
	
}
