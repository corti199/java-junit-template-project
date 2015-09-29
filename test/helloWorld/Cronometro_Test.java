package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.Cronometro;

public class Cronometro_Test {
	
	Cronometro c = new Cronometro();
	
	@Test
	public void test() {
	c.reiniciar();
	assertEquals("0 minutos,0 segundos", c.mosTiempotrarTiempo());
	}
	
	@Test
	public void test2() {
	c.reiniciar();
	assertNotEquals("0 minutos,1 segundos", c.mosTiempotrarTiempo());
	}
	
}
