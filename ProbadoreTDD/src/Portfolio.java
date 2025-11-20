import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Portfolio {
    private List<Object> elementos;
    private Set<Object> nodosUnicos;

    public Portfolio() {
        this.elementos = new ArrayList<>();
        this.nodosUnicos = new HashSet<>();
    }

    public void agregar(Object elemento) {
        if (nodosUnicos.contains(elemento)) {
            throw new IllegalArgumentException("No se puede agregar el mismo nodo dos veces");
        }
        nodosUnicos.add(elemento);
        elementos.add(elemento);
        if (elemento instanceof Portfolio) {
            nodosUnicos.addAll(((Portfolio) elemento).nodosUnicos);
        }
    }

    public int getBalance() {
        int total = 0;
        for (Object elemento : elementos) {
            if (elemento instanceof Cuenta) {
                total += ((Cuenta) elemento).getBalance();
            } else if (elemento instanceof Portfolio) {
                total += ((Portfolio) elemento).getBalance();
            }
        }
        return total;
    }

    public List<String> transacciones() {
        List<String> todas = new ArrayList<>();
        for (Object elemento : elementos) {
            if (elemento instanceof Cuenta) {
                todas.addAll(((Cuenta) elemento).transacciones());
            } else if (elemento instanceof Portfolio) {
                todas.addAll(((Portfolio) elemento).transacciones());
            }
        }
        return todas;
    }

    public boolean haRegistrado(String descripcion) {
        for (Object elemento : elementos) {
            if (elemento instanceof Cuenta && ((Cuenta) elemento).haRegistrado(descripcion)) {
                return true;
            } else if (elemento instanceof Portfolio && ((Portfolio) elemento).haRegistrado(descripcion)) {
                return true;
            }
        }
        return false;
    }
}
