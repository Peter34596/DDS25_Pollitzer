import java.util.HashSet;

public class TipoProd {
    private HashSet<Imp> impuestos;
    private  String nombre;

    public TipoProd(HashSet<Imp> impuestos, String nombre) {
        this.impuestos = impuestos;
        this.nombre = nombre;
    }

    public HashSet<Imp> getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(HashSet<Imp> impuestos) {
        this.impuestos = impuestos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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
