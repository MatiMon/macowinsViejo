package negocio;

import producto.Prenda;

public class VtaTarjeta extends Venta{
    int cuotas;
    double coeficienteFijo = 1;

    public VtaTarjeta(int cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public double recargo(double valorPrenda) {
        return cuotas * coeficienteFijo + 0.01 * valorPrenda;
    }

    @Override
    public double precioVenta() {
        return super.sumatoriaPrecioPrendas() + this.recargo(coeficienteFijo);
    }
}
