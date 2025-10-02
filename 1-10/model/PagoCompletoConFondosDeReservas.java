package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PagoCompletoConFondosDeReservas extends CriterioLiquidacion {
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
        double totalGastos = gastosAgrupados.get("ordinarios") + gastosAgrupados.get("extraordinarios");
        double montoCubiertoPorFondos = Math.min(totalGastos, saldoBancario);
        double montoADividir = totalGastos - montoCubiertoPorFondos;
        double factorReduccion = totalGastos > 0 ? montoADividir / totalGastos : 0;
        double montoOrdADividir = gastosAgrupados.get("ordinarios") * factorReduccion;
        double montoExtADividir = gastosAgrupados.get("extraordinarios") * factorReduccion;
        double montoOrdUf = montoOrdADividir * porcentajeUf;
        double montoExtUf = montoExtADividir * porcentajeUf;
        return new double[]{montoOrdUf, montoExtUf};
    }
}
