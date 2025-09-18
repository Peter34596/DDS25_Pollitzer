import adapter.IAdapter;

public class Deposito implements IObsever{
    IAdapter adapter;
    @Override
    public String notificacion(Prod prod) {
        return adapter.operacion();
    }
}
