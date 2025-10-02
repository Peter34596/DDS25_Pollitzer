package model;

import java.time.LocalDate;

public class LiquidacionMensualBuilder extends ExpensaBuilder {
    @Override
    public void buildBase(int idUf, LocalDate periodo) {
        expensa = new Expensa();
        expensa.id_uf = idUf;
        expensa.fecha = periodo;
    }

    @Override
    public void buildValoresOrdinarios(double monto) {
        expensa.valorOrdinario = monto;
    }

    @Override
    public void buildValoresExtraordinarios(double monto) {
        expensa.valorExtraordinario = monto;
    }

    @Override
    public void buildDeudaAnterior(double deuda) {
        // Si tienes el campo deudaAnterior, agrégalo aquí
        // expensa.deudaAnterior = deuda;
    }

    @Override
    public void buildTotal() {
        expensa.total = expensa.valorOrdinario + expensa.valorExtraordinario; // + expensa.deudaAnterior si existe
    }
}
