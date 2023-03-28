package test.seis;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.seis.Calculadora;

public class CalculadoraTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void firstTest() {
		Calculadora calculadora = new Calculadora();
		calculadora.multiplicar(80, 3);
		assertEquals(calculadora.resultado, 240, 0.001);
	}
	
	@Test
	public void secondTest() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumar(150, 180);
		calculadora.dividir(calculadora.resultado, 3);
		assertEquals(calculadora.resultado, 110, 0.001);
	}
	
	@Test
	public void thirdTest() {
		Calculadora calculadora = new Calculadora();
		calculadora.restar(90, 50);
		calculadora.multiplicar(calculadora.resultado, 15);
		assertNotEquals(calculadora.resultado, 605, 0.001);
	}
	
	@Test
	public void fourthTest() {
		Calculadora calculadora = new Calculadora();
		calculadora.sumar(70, 40);
		calculadora.multiplicar(calculadora.resultado, 25);
		assertNotEquals(calculadora.resultado, 2700, 0.001);
	}

}
