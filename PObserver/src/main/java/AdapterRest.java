public class AdapterRest implements IAdapter {
    private Rest rest;

    public AdapterRest(Rest rest) {
        this.rest = rest;
    }

    public Rest getRest() {
        return rest;
    }

    public void setRest(Rest rest) {
        this.rest = rest;
    }

    @Override
    public String operacion(Prod prod) {
        return rest.Operacion(prod);
    }
}
