package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PagoCompletoYGenerarFuturosFondos extends CriterioLiquidacion {
    @Override
    public Map<String, Double> obtenerGastosAgrupados(List<Gasto> gastos) {
        double ordinarios = 0, extraordinarios = 0, fondosReserva = 0;
        for (Gasto g : gastos) {
            switch (g.getTipoExpensa()) {
                case ORDINARIA:
                    ordinarios += g.getMonto();
                    break;
                case EXTRAORDINARIA:
                    extraordinarios += g.getMonto();
                    break;
                case FONDO_RESERVA:
                    fondosReserva += g.getMonto();
                    break;
                default:
                    break;
            }
        }
        Map<String, Double> agrupados = new HashMap<>();
        agrupados.put("ordinarios", ordinarios);
        agrupados.put("extraordinarios", extraordinarios);
        agrupados.put("fondos_reserva_neto", fondosReserva);
        return agrupados;
    }

    @Override
    public double[] dividirExpensas(Map<String, Double> gastosAgrupados, double porcentajeUf, double saldoBancario) {
        double RESERVA_ADICIONAL_TOTAL = 2000.00;
        double montoOrdinarioADividir = gastosAgrupados.get("ordinarios") + RESERVA_ADICIONAL_TOTAL;
        double montoExtraordinarioADividir = gastosAgrupados.get("extraordinarios");
        double montoOrdUf = montoOrdinarioADividir * porcentajeUf;
        double montoExtUf = montoExtraordinarioADividir * porcentajeUf;
        return new double[]{montoOrdUf, montoExtUf};
    }
}
