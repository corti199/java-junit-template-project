package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.HelloWorld;

public class HelloWorldTest {
	@Test
	HelloWorld c = new HelloWorld();
	public void test() {
	assertEquals("Hola", c.obtener());
	}
	
}
