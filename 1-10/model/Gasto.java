package model;
import java.time.LocalDate;

public class Gasto {
    private double monto;
    private TipoGasto tipo;
    private TipoExpensa tipoExpensa;
    private boolean recurrente;
    private LocalDate fecha;
    // ...otros atributos relevantes

    public double getMonto() { return monto; }
    public TipoExpensa getTipoExpensa() { return tipoExpensa; }
    public void setTipoExpensa(TipoExpensa tipoExpensa) {
        this.tipoExpensa = tipoExpensa;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }


    
    // Getters, setters y constructores
}
