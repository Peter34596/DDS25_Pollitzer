package model;

import java.util.List;
import java.util.Map;

public abstract class CriterioLiquidacion {
    public abstract Map<String, Double> obtenerGastosAgrupados(List<Gasto> gastos);
    public abstract double[] dividirExpensas(Map<String, Double> gastosAgrupados, double porcentajeUf, double saldoBancario);
}
