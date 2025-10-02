package model;
import java.util.List;

public class UnidadFuncional {
    private int identificador;
    private double porcentajeExpensa;
    private double deudaAnterior;
    private List<Interesado> propietarios;
    private List<Interesado> inquilinos;
    // ...otros atributos relevantes

    // Getters, setters y constructores
    public int getId() {
        return identificador;
    }
    public double getPorcentajeExpensa() {
        return porcentajeExpensa;
    }
    public double getDeudaAnterior() {
        return deudaAnterior;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public void setPorcentajeExpensa(double porcentajeExpensa) {
        this.porcentajeExpensa = porcentajeExpensa;
    }
    public void setDeudaAnterior(double deudaAnterior) {
        this.deudaAnterior = deudaAnterior;
    }
}
