import java.util.HashSet;

public class TipoProd {
    private HashSet<Imp> impuestos;
    private  String nombre;

    public double CalcularImpuestos(double Pb) {
        double todosImpu=0;
        for(Imp impu:impuestos){
            todosImpu += impu.Calcular(Pb);
        }
        return todosImpu;
    }
    public void agregarImp(Imp imp) {
        impuestos.add(imp);
    }
}
