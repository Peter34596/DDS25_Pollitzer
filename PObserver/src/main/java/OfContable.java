public class OfContable implements IObsever{
    IAdapter adapter;
    @Override
    public String notificacion(Prod prod) {
        return adapter.operacion();
    }
}
