import adapter.IAdapter;

public class ContVentas implements IObsever{
    IAdapter adapter;
    @Override
    public String notificacion(Prod prod) {
        return adapter.operacion();
    }
}