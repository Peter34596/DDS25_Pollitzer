package Impuestos;

public class EL implements Imp {
    double GI = 3.5;
    @Override
    public double Calcular(double pb) {
        return (pb/4+0.3*GI);
    }
}
