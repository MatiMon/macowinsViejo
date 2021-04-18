package negocio;

import producto.Prenda;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Venta {
    List<Prenda> prendas;
    int cantidad;
    LocalDateTime fecha;

    public double sumatoriaPrecioPrendas(){ //sumatoria de los precios propios de las prendas
        return prendas.stream().mapToDouble(prenda -> prenda.precio()).sum() ;
    }

    public abstract double recargo(double valorPrenda);

    public abstract double precioVenta();
    // VtaEfectivo y VtaTarjeta implementan este metodo de la misma forma, puedo evitar esa repeticion de codigo?
}
