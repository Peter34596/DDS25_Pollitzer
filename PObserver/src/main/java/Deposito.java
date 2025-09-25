public class Deposito implements IObsever{
    IAdapter adapter;

    public Deposito(IAdapter adapter) {
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
