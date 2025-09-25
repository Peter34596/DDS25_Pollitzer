public class EO implements Imp {
    double GI = 4;
    @Override
    public double Calcular(double pb) {
        double cuenta = (0.5*pb)/(4*GI);
        return cuenta;
    }
}
