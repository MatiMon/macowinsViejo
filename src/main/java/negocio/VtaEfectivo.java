package negocio;

import producto.Prenda;

public class VtaEfectivo extends Venta {
    double coeficienteFijo = 1;

    @Override
    public double recargo(double valorPrenda) {
        return valorPrenda * coeficienteFijo;
    }

    @Override
    public double precioVenta() {
        return super.sumatoriaPrecioPrendas() + this.recargo(coeficienteFijo);
    }
}
