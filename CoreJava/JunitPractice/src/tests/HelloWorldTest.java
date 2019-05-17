package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.HelloWorld;

public class HelloWorldTest {
	
	@Test
	public void testGreet()
	{
	assertEquals("Hello",new HelloWorld().printHelloWorld());
	}
}
