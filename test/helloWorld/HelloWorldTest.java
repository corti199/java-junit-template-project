package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.HelloWorld;

public class HelloWorldTest {
	@Test
	Cronometro c = new Cronometro();
	public void test() {
	assertEquals("Hola", c.obtener());
	}
	
}
