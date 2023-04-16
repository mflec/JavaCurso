package main.siete_ocho;

public class DescuentoPorcentajeConTope {
    private Float descuento;
    private Float topeDescuento;

    public DescuentoPorcentajeConTope(Float descuento, Float topeDescuento) {
        this.descuento = descuento;
        this.topeDescuento = topeDescuento;
    }

    public float getPrecioFinal(Float numero) {
        float descuentoAplicado = numero * (this.descuento / 100);
        if (descuentoAplicado > this.topeDescuento) { 
            descuentoAplicado = this.topeDescuento;
        }
        return numero - descuentoAplicado;
    }
    
}
