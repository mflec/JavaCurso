package main.siete;

import java.time.LocalDate;

public class Carrito {
	@SuppressWarnings("unused")
	private Persona persona;
	private Producto producto1;
	private Producto producto2;
	@SuppressWarnings("unused")
	private Producto producto3;
	@SuppressWarnings("unused")
	private LocalDate fechaCompra;
	private Float costoFinal;
	@SuppressWarnings("unused")
	private String tipoDescuento;
	@SuppressWarnings("unused")
	private Float valorDescuento;

	public Carrito(Persona persona) {
		this.persona = persona;
		this.fechaCompra = LocalDate.now();
	};

	public void setValorDesc(String tipoDescuento, float valorDescuento) {
		this.tipoDescuento = tipoDescuento;
		this.valorDescuento = valorDescuento;
		Descuento descuento;
		
		if ("%".equals(tipoDescuento)) {
			descuento = new DescuentoFijo(valorDescuento);
			this.costoFinal = descuento.valorFinal(this.costoFinal);
	    } else if ("fijo".equals(tipoDescuento)) {
	    	descuento = new DescuentoPorcentaje(valorDescuento);
			this.costoFinal = descuento.valorFinal(this.costoFinal);
	    }
	}

	public void setProducto(Producto producto) {
		if (this.producto1 == null) {
			this.producto1 = producto;
			this.costoFinal = (float) 0.0;
		} else if (this.producto2 == null) {
			this.producto2 = producto;
		} else {
			this.producto3 = producto;
		}

		this.costoFinal = this.costoFinal + (producto.getPrecio() * producto.getCantidad());

	};

	public Float getPrecioFinal() {
		return this.costoFinal;
	};
};