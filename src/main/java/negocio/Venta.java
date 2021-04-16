package negocio;

import producto.Prenda;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Venta {
    List<Prenda> prendas;
    int cantidad;
    LocalDateTime fecha;

    public abstract double precioVenta(Prenda prenda);
    public abstract double recargo(double valorPrenda);
}
