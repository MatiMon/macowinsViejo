package negocio;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Negocio {
    List<Venta> ventas;

    public double gananciasDeUnDia(LocalDateTime dia){
        ventas.stream().filter(venta -> venta.fecha == dia).forEach(venta -> venta.prendas.stream().forEach(prenda -> venta.precioVenta(prenda).sum()));
        /* y aca no se como hacer que por cada elemento de la coleccion ventas sume todos los precioVenta(Prenda prenda) de la coleccion prendas
            quizas sea un error en el diseño del metodo precioVenta de la clase abstracta Venta pero no se me ocurrio otra forma
        * */
    }
}
