package main.seis;

public class Calculadora {
	@SuppressWarnings("unused")
	public double resultado;
	
	public Calculadora() {
		this.resultado = 0.0;
	}

	public void sumar(double unNumero, double otroNumero) {
		this.resultado = unNumero + otroNumero;
	};

	public void restar(double unNumero, double otroNumero) {
		this.resultado = unNumero - otroNumero;
	};

	public void multiplicar(double unNumero, double otroNumero) {
		this.resultado = unNumero * otroNumero;
	};

	public void dividir(double unNumero, double otroNumero) {
		this.resultado = unNumero / otroNumero;
	};
}
