package main.siete_ocho;

public class DescuentoFijo extends Descuento {	
	public DescuentoFijo(float valor) {
		super(valor);
	};

	@Override
	public float valorFinal(float valorInicial) {
		return valorInicial - this.getValorDesc();
	}
}
