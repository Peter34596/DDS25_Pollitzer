package model;
import java.time.LocalDate;

public class Expensa {
    public int id_uf;
    public LocalDate fecha;
    public double valorOrdinario;
    public double valorExtraordinario;
    public double total;
    public boolean pagada;
    public Expensa() {}

    public int getIdUf() { return id_uf; }
    public void setIdUf(int id_uf) { this.id_uf = id_uf; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public double getValorOrdinario() { return valorOrdinario; }
    public void setValorOrdinario(double valorOrdinario) { this.valorOrdinario = valorOrdinario; }
    public double getValorExtraordinario() { return valorExtraordinario; }
    public void setValorExtraordinario(double valorExtraordinario) { this.valorExtraordinario = valorExtraordinario; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    public boolean isPagada() { return pagada; }
    public void setPagada(boolean pagada) { this.pagada = pagada; }
    // ...otros atributos relevantes

    // Getters, setters y constructores
}
