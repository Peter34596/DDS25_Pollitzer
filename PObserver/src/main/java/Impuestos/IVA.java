package Impuestos;

public class IVA implements Imp {
    @Override
    public double Calcular(double pb) {
        double vlaor = 0.21 * pb;
        return vlaor;
    }
}
