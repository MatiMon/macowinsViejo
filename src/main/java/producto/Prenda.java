package producto;

public class Prenda {
    Tipo tipo;
    Estado estado;
    double precioPropio;

    public double precio(){
        return precioPropio * estado.modificador();
    }

    public String tipo(){
        switch(tipo){
            case 1: tipo.equals(Tipo.SACO);
            return "Saco";
            break;
            case 2: tipo.equals(Tipo.PANTALON);
            return "Pantalon";
            break;
            case 3: tipo.equals(Tipo.CAMISA);
            return "Camisa";
            break;
        }
    }

}
