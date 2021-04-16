package negocio;

import producto.Prenda;

public class VtaEfectivo extends Venta {

    @Override
    public double precioVenta(Prenda prenda) {
        return prenda.precio() + this.recargo(prenda.precio());
    }

    @Override
    public double recargo(double valorPrenda) {
        return 0;
    }
}
