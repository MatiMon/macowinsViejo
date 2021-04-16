package negocio;

import producto.Prenda;

public class VtaTarjeta extends Venta{
    int cuotas;
    double coeficienteFijo = 1;

    public VtaTarjeta(int cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public double precioVenta(Prenda prenda) {
        return prenda.precio() + this.recargo(prenda.precio());
    }

    @Override
    public double recargo(double valorPrenda) {
        return cuotas * coeficienteFijo + 0.01 * valorPrenda;
    }
}
