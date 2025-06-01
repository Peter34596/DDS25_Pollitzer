package Ej1MqExpep;

import java.util.HashMap;

public class MaquinaExpendedora {
    private Estado estado;
    private HashMap<Integer, HashMap<Producto, Integer>> productos;
    private int dineroAcumulado;

    public MaquinaExpendedora() {
        this.estado = new SinDinero();
        this.productos = new HashMap<>();
        this.dineroAcumulado = 0;
    }

    public int getDineroAcumulado() {
        return dineroAcumulado;
    }

    public void setDineroAcumulado(int dineroAcumulado) {
        this.dineroAcumulado = dineroAcumulado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public  HashMap<Integer, HashMap<Producto, Integer>> getStock() {
        return productos;
    }

    public void setStock( HashMap<Integer, HashMap<Producto, Integer>> stock) {
        this.productos = stock;
    }

    public void cambiarEstado() {
        estado.cambiarEstado(this);
    }
    public void cambiarStock(int id, Producto producto, int cantidad) {
        if (productos.containsKey(id)) {
            HashMap<Producto, Integer> stockeado = productos.get(id);
            if (stockeado.containsKey(producto)) {
                int nuevoStock = stockeado.get(producto) - cantidad;
                stockeado.put(producto, Math.max(nuevoStock, 0));
            }
        }
    }


}

