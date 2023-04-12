package main.siete;

public class Producto {
	private String nombre;
	private int cantidad;
	private Float precio;

	public Producto(String nombre, int cantidad, Float precio) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	};

	public String getNombre() {
		return this.nombre;
	};

	public int getCantidad() {
		return this.cantidad;
	};

	public Float getPrecio() {
		return this.precio;
	};
}