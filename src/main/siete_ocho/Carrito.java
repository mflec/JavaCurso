package main.siete_ocho;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Carrito {
	private Persona persona;
	private LocalDate fechaCompra;
	private Float costoFinal = (float) 0;
	private String tipoDescuento;
	private Float valorDescuento;

	public List<Producto> items;

	public Carrito(Persona persona) {
		this.items = new ArrayList<Producto>();
		this.persona = persona;
		this.fechaCompra = LocalDate.now();
	};

	public void setValorDesc(String tipoDescuento, float valorDescuento) throws DescuentoExcesivoException, CarritoCeroException {
		if (costoFinal.equals((float)0)) {
			throw new CarritoCeroException();
		}

		this.tipoDescuento = tipoDescuento;
		this.valorDescuento = valorDescuento;
		Descuento descuento;

		if ("fijo".equals(tipoDescuento)) {
			descuento = new DescuentoFijo(valorDescuento);
			this.costoFinal = descuento.valorFinal(this.costoFinal);
		} else if ("%".equals(tipoDescuento)) {
			descuento = new DescuentoPorcentaje(valorDescuento);
			this.costoFinal = descuento.valorFinal(this.costoFinal);
		}

		if (costoFinal < 0) {
			throw new DescuentoExcesivoException(costoFinal, valorDescuento);
		}
	}

	public void setProducto(Producto producto) {
		this.items.add(producto);
		this.costoFinal = this.costoFinal + (producto.getPrecio() * producto.getCantidad());
	};

	public List<Producto> getItems() {
		return items;
	}

	public Float getPrecioFinal() {
		return this.costoFinal;
	};
};