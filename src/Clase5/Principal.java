package Clase5;

public class Principal {
	public static void main (String[] args) {
		Persona comprador = new Persona("Milagros", "Lechares");
		
		Carrito carrito = new Carrito(comprador);

		Producto producto1 = new Producto("jabón en polvo", 1 , (float) 40);	
		carrito.setProducto(producto1);
		
		Producto producto2 = new Producto("esponjas", 3 , (float) 10);
		carrito.setProducto(producto2);		
		
		Producto producto3 = new Producto("chocolates",2, (float) 100);
		carrito.setProducto(producto3);
		
		System.out.println("Costo Final: " + carrito.getPrecioFinal());
	}
}
