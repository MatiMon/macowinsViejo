package producto;

public class Prenda {
    Tipo tipo;
    Estado estado;
    double precioPropio;

    public double precio(){
        return precioPropio * estado.modificador();
    }

}
