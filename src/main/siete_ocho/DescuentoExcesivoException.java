package main.siete_ocho;

public class DescuentoExcesivoException extends Exception {
	public DescuentoExcesivoException(float precioFinal, float descuento) {
        super("El descuento aplicado al producto es demasiado grande.");
    }
}
