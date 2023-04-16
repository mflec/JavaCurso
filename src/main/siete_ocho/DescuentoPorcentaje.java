package main.siete_ocho;

public class DescuentoPorcentaje extends Descuento {

	public DescuentoPorcentaje(float valor) {
		super(valor);
	};

	@Override
	public float valorFinal(float valorInicial) {
		return valorInicial - (valorInicial * this.getValorDesc()) / 100;
	}

}