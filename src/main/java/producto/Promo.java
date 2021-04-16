package producto;

public class Promo implements Estado{
    double modificador = 1;

    public Promo(double valor) {
        modificador = valor;
    }

    @Override
    public double modificador() {
        return modificador;
    }
}
