import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private int balance;
    private List<String> transacciones;

    public Cuenta(int balance) {
        this.balance = balance;
        this.transacciones = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void registrarTransaccion(String descripcion) {
        transacciones.add(descripcion);
    }

    public List<String> transacciones() {
        return new ArrayList<>(transacciones);
    }

    public boolean haRegistrado(String descripcion) {
        return transacciones.contains(descripcion);
    }
}
