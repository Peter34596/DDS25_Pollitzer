import java.util.HashSet;

public class Sucursales {
    private String nombre;
    private String direcc;
    private HashSet<Prod> listVentas;
    private HashSet<IObsever> listObsever;

    private void regProductos(Prod p) {
        for (IObsever Pv : listObsever) {
            Pv.notificacion(p);
        }
    }

    private void regVentas(Prod p) {
        for (IObsever Pv : listObsever) {
            Pv.notificacion(p);
        }
    }
}
