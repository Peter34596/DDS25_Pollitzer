package model;

import java.time.LocalDate;
import java.util.Map;

public class LiquidadorDirector {
    private Consorcio consorcio;
    private int idAdministrador;
    private ExpensaBuilder builder;

    public LiquidadorDirector(Consorcio consorcio, int idAdministrador) {
        this.consorcio = consorcio;
        this.idAdministrador = idAdministrador;
        this.builder = new LiquidacionMensualBuilder();
    }

    public void ejecutarLiquidacion(CriterioLiquidacion criterio, LocalDate periodo) {
        System.out.println("\n================ INICIO LIQUIDACIÓN (" + criterio.getClass().getSimpleName() + ") ================");
        double saldoBancario = consorcio.obtenerSaldoBancario();
        System.out.println("  -> Saldo Actual del Consorcio: $" + saldoBancario);
        Map<String, Double> gastosPeriodo = criterio.obtenerGastosAgrupados(consorcio.getGastos());
        System.out.println("  -> Gastos Ordinarios Totales: $" + gastosPeriodo.get("ordinarios"));
        System.out.println("  -> Gastos Extraordinarios Totales: $" + gastosPeriodo.get("extraordinarios"));
        consorcio.setExpensasGeneradas(new java.util.ArrayList<>());
        for (UnidadFuncional uf : consorcio.getUnidades().values()) {
            double[] montos = criterio.dividirExpensas(gastosPeriodo, uf.getPorcentajeExpensa(), saldoBancario);
            System.out.println("\n  > Construyendo Expensa para UF " + uf.getId() + " (Prop: " + (uf.getPorcentajeExpensa()*100) + "% )");
            builder.buildBase(uf.getId(), periodo);
            builder.buildValoresOrdinarios(montos[0]);
            builder.buildValoresExtraordinarios(montos[1]);
            builder.buildDeudaAnterior(uf.getDeudaAnterior());
            builder.buildTotal();
            Expensa expensaFinal = builder.getExpensa();
            consorcio.getExpensasGeneradas().add(expensaFinal);
            consorcio.notificarInteresados(expensaFinal);
        }
        System.out.println("================ FIN LIQUIDACIÓN ================\n");
    }
}
