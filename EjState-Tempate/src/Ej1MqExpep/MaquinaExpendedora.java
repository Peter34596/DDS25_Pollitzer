package Ej1MqExpep;

import java.util.HashMap;

public class MaquinaExpendedora {
    Estado estado;
    HashMap<Producto, Integer> stock;
    int DinerAcumulado;

    public MaquinaExpendedora(Estado estado, HashMap<Producto, Integer> stock, int dinerAcumulado) {
        this.estado = estado;
        this.stock = stock;
        DinerAcumulado = dinerAcumulado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public HashMap<Producto, Integer> getStock() {
        return stock;
    }

    public void setStock(HashMap<Producto, Integer> stock) {
        this.stock = stock;
    }

    public int getDinerAcumulado() {
        return DinerAcumulado;
    }

    public void setDinerAcumulado(int dinerAcumulado) {
        DinerAcumulado = dinerAcumulado;
    }

    public void cambiarStock(MaquinaExpendedora maquinaExpendedora) {}

    public void cambiarEstado() {}
}