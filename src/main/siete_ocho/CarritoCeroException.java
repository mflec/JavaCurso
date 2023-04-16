package main.siete_ocho;

public class CarritoCeroException extends Exception {
	public CarritoCeroException() {
		super("No se puede aplicar un descuento cuando el carrito tiene un valor 0");
	};
};
