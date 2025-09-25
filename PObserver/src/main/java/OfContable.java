public class OfContable implements IObsever{
    IAdapter adapter;

    public OfContable(IAdapter adapter) {
        this.adapter = adapter;
    }

    public IAdapter getAdapter() {
        return adapter;
    }

    public void setAdapter(IAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public String notificacion(Prod prod) {
        return adapter.operacion(prod);
    }
}
