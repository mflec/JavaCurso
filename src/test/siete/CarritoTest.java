package test.siete;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.siete.Carrito;
import main.siete.DescuentoPorcentajeConTope;
import main.siete.Persona;
import main.siete.Producto;

public class CarritoTest {

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
		Persona comprador = new Persona("Milagros", "Lechares");

		Carrito carrito = new Carrito(comprador);

		Producto producto1 = new Producto("jabón en polvo", 1, (float) 40);
		carrito.setProducto(producto1);

		Producto producto2 = new Producto("esponjas", 3, (float) 10);
		carrito.setProducto(producto2);
		
		carrito.setValorDesc("fijo", 60);
		
		assertEquals(carrito.getPrecioFinal(), 28.0, 0.001);
	}
	
	@Test
	public void secondTest() {
		DescuentoPorcentajeConTope desc1 = new DescuentoPorcentajeConTope((float)60, (float)10);
		assertEquals(desc1.getPrecioFinal((float)50), 40.0, 0.001);
	}


}