package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.Cronometro;

public class Cronometro_Test {
	
	Cronometro c = new Cronometro();
	
	@Test
	public void test() {
	assertEquals("Hola", c.obtener());
	}
	
}
