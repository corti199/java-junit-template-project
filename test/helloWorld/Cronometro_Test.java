package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.Cronometro;

public class Cronometro_Test {
	
	Cronometro c = new Cronometro();
	
			@Test
	public void mostrarTiempo_test() {
	assertEquals("0 minutos,0 segundos", c.mosTiempotrarTiempo());
	}
	


	@Test
	public void test_Reiniciar() {
	c.reiniciar();
	assertEquals("0 minutos,0 segundos", c.mosTiempotrarTiempo());
	}
	
	@Test
	public void test_Reiniciar2() {
	c.reiniciar();
	assertNotEquals("0 minutos,1 segundos", c.mosTiempotrarTiempo());
	}
	
	
	
		@Test
	public void test_incrementar() {
	c.reiniciar();	
	c.incrementarTiempo();
	assertEquals("0 minutos,1 segundos", c.mosTiempotrarTiempo());
	}
			@Test
	public void test_incrementar2() {
	c.reiniciar();	
	c.incrementarTiempo();
	assertEquals("0 minutos,2 segundos", c.mosTiempotrarTiempo());
	}
	
	@Test
	public void test_incrementar3() {
	c.incrementarTiempo();
	assertNotEquals("0 minutos,2 segundos", c.mosTiempotrarTiempo());
	}
	
	
	@Test
	public void test_incrementar5000seg() {
	assertNotEquals("83 minutos,333333333 segundos", c.mosTiempotrarTiempo());
	}

	
}
