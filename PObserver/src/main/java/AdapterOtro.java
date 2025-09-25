public class AdapterOtro implements IAdapter {
    private OtroSist otroSist;

    public AdapterOtro(OtroSist otroSist) {
        this.otroSist = otroSist;
    }

    public OtroSist getOtroSist() {
        return otroSist;
    }

    public void setOtroSist(OtroSist otroSist) {
        this.otroSist = otroSist;
    }
    @Override
    public String operacion(Prod prod) {
        return otroSist.Operacion(prod);
    }
}
