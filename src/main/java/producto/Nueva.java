package producto;

public class Nueva implements Estado{
    double modificador = 1;

    @Override
    public double modificador() {
        return modificador;
    }

}
