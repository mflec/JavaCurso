package main.siete;

public abstract class Descuento {
	private float valor;
	
	public Descuento(float valor) {
		this.valor = valor;
	};
	
	public float getValorDesc () {
		return this.valor;
	}

	public abstract float valorFinal(float valorInicial);
};
