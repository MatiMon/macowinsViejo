package negocio;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Comercio {
    List<Venta> ventas;

    public List<Venta> ventasDeUnDia(LocalDateTime dia){
        return ventas.stream().filter(venta -> venta.fecha.isEqual(dia)).collect(Collectors.toList());
    }

    public double gananciasDeUnDia(LocalDateTime dia){
        return this.ventasDeUnDia(dia).stream().mapToDouble(venta -> venta.precioVenta()).sum();
    }
}
