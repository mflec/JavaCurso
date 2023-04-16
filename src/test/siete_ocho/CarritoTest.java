package test.siete_ocho;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.siete_ocho.Carrito;
import main.siete_ocho.CarritoCeroException;
import main.siete_ocho.DescuentoExcesivoException;
import main.siete_ocho.DescuentoPorcentajeConTope;
import main.siete_ocho.Persona;
import main.siete_ocho.Producto;

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
	public void firstTest() throws DescuentoExcesivoException, CarritoCeroException {
		Persona comprador = new Persona("Milagros", "Lechares");

		Carrito carrito = new Carrito(comprador);

		Producto producto1 = new Producto("jabón en polvo", 1, (float) 40);
		carrito.setProducto(producto1);

		Producto producto2 = new Producto("esponjas", 3, (float) 10);
		carrito.setProducto(producto2);

		carrito.setValorDesc("fijo", 60);

		assertEquals(carrito.getPrecioFinal(), 10.0, 0.001);
	}

	@Test
	public void secondTest() {
		DescuentoPorcentajeConTope desc1 = new DescuentoPorcentajeConTope((float) 60, (float) 10);
		assertEquals(desc1.getPrecioFinal((float) 50), 40.0, 0.001);
	}

	@Test
	public void thirdTest() throws DescuentoExcesivoException, CarritoCeroException {
		Persona comprador = new Persona("Milagros", "Lechares");

		Carrito carrito = new Carrito(comprador);

		Producto producto1 = new Producto("jabón en polvo", 1, (float) 40);
		carrito.setProducto(producto1);

		Producto producto2 = new Producto("esponjas", 3, (float) 10);
		carrito.setProducto(producto2);

		carrito.setValorDesc("%", (float)50);
		
		assertEquals(carrito.getPrecioFinal(), 35.0, 0.001);
	}

	@Test
	public void testDescuentoExcesivoException() throws CarritoCeroException {
		Persona comprador = new Persona("Milagros", "Lechares");
		Carrito carrito = new Carrito(comprador);

		Producto producto1 = new Producto("jabón en polvo", 1, (float) 40);
		carrito.setProducto(producto1);

		try {
			carrito.setValorDesc("fijo", 60);
			fail("No se lanzó la excepción DescuentoExcesivoException.");
		} catch (DescuentoExcesivoException e) {
			assertEquals("El descuento aplicado al producto es demasiado grande.", e.getMessage());
		}
	}

}