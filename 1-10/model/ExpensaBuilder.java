package model;

import java.time.LocalDate;

public abstract class ExpensaBuilder {
    protected Expensa expensa;

    public abstract void buildBase(int idUf, LocalDate periodo);
    public abstract void buildValoresOrdinarios(double monto);
    public abstract void buildValoresExtraordinarios(double monto);
    public abstract void buildDeudaAnterior(double deuda);
    public abstract void buildTotal();

    public Expensa getExpensa() {
        return expensa;
    }
}
