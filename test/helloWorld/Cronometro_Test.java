package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.Conometro;

public class Cronometro_Test {
	
	@Test
	Cronometro c = new Cronometro();
	public void test() {
	assertEquals("Hola", c.obtener());
	}
	
}
