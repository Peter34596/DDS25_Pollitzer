package model;
import java.util.List;

import java.util.*;
import model.Gasto;
import model.Expensa;
import model.UnidadFuncional;

public class Consorcio {
    private int id;
    private String cbu;
    private double saldoActual;
    private List<Gasto> gastos;
    private Map<Integer, UnidadFuncional> unidades;
    private List<Expensa> expensasGeneradas;

    public Consorcio(int id, double saldoInicial, String cbu) {
        this.id = id;
        this.cbu = cbu;
        this.saldoActual = saldoInicial;
        this.gastos = new ArrayList<>();
        this.unidades = new HashMap<>();
        this.expensasGeneradas = new ArrayList<>();
    }

    public void cargarGasto(Gasto gasto) {
        gastos.add(gasto);
    }

    public double obtenerSaldoBancario() {
        // Simula la llamada al Servicio Saldo Cuentas
        System.out.println("  -> Llamando a Servicio Saldo Cuentas para CBU " + cbu + "...");
        return saldoActual;
    }

    public void agregarUnidad(UnidadFuncional uf) {
        unidades.put(uf.getId(), uf);
    }

    public void notificarInteresados(Expensa expensa) {
        // Simula la llamada al Servicio Notificaciones
        UnidadFuncional uf = unidades.get(expensa.getIdUf());
        // Aquí se debería obtener el medio y destinatario real
        System.out.println("  -> [NOTIFICACION] Enviando Expensa UF " + expensa.getIdUf() + " a Propietario via EMAIL.");
    }

    // Getters y setters
    public int getId() { return id; }
    public String getCbu() { return cbu; }
    public double getSaldoActual() { return saldoActual; }
    public List<Gasto> getGastos() { return gastos; }
    public Map<Integer, UnidadFuncional> getUnidades() { return unidades; }
    public List<Expensa> getExpensasGeneradas() { return expensasGeneradas; }
    public void setExpensasGeneradas(List<Expensa> expensas) { this.expensasGeneradas = expensas; }
}
