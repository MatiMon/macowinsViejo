package producto;

public class Liquidacion implements Estado{
    double modificador = 0.5;

    @Override
    public double modificador() {
        return modificador;
    }
}
