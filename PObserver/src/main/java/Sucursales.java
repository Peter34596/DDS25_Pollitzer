import java.util.HashSet;

public class Sucursales {
    private String nombre;
    private String direcc;
    private HashSet<Prod> listVentas;
    private HashSet<IObsever> listObsever;

    public Sucursales(String nombre, String direcc, HashSet<Prod> listVentas, HashSet<IObsever> listObsever) {
        this.nombre = nombre;
        this.direcc = direcc;
        this.listVentas = listVentas;
        this.listObsever = listObsever;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public HashSet<Prod> getListVentas() {
        return listVentas;
    }

    public void setListVentas(HashSet<Prod> listVentas) {
        this.listVentas = listVentas;
    }

    public HashSet<IObsever> getListObsever() {
        return listObsever;
    }

    public void setListObsever(HashSet<IObsever> listObsever) {
        this.listObsever = listObsever;
    }

    public void regProductos(Prod p) {
        for (IObsever Pv : listObsever) {
            Pv.notificacion(p);
        }
    }

    public void regVentas(Prod p) {
        for (IObsever Pv : listObsever) {
            Pv.notificacion(p);
        }
    }
}
