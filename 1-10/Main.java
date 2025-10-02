import model.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Configuración Inicial del Consorcio y Unidades
        Consorcio consorcio = new Consorcio(101, 5000.00, "123456789");

        // Unidades Funcionales (UF) con su porcentaje de expensa y deuda anterior
    UnidadFuncional uf1 = new UnidadFuncional();
    uf1.setIdentificador(101);
    uf1.setPorcentajeExpensa(0.30);
    uf1.setDeudaAnterior(150.00);
    consorcio.agregarUnidad(uf1);

    UnidadFuncional uf2 = new UnidadFuncional();
    uf2.setIdentificador(102);
    uf2.setPorcentajeExpensa(0.45);
    uf2.setDeudaAnterior(0.00);
    consorcio.agregarUnidad(uf2);

    UnidadFuncional uf3 = new UnidadFuncional();
    uf3.setIdentificador(103);
    uf3.setPorcentajeExpensa(0.25);
    uf3.setDeudaAnterior(75.00);
    consorcio.agregarUnidad(uf3);

    // 2. Carga de Gastos del Mes
    Gasto g1 = new Gasto();
    g1.setTipoExpensa(TipoExpensa.ORDINARIA);
    g1.setMonto(4500.00);
    consorcio.cargarGasto(g1);

    Gasto g2 = new Gasto();
    g2.setTipoExpensa(TipoExpensa.ORDINARIA);
    g2.setMonto(3000.00);
    consorcio.cargarGasto(g2);

    Gasto g3 = new Gasto();
    g3.setTipoExpensa(TipoExpensa.EXTRAORDINARIA);
    g3.setMonto(1500.00);
    consorcio.cargarGasto(g3);

    Gasto g4 = new Gasto();
    g4.setTipoExpensa(TipoExpensa.FONDO_RESERVA);
    g4.setMonto(500.00);
    consorcio.cargarGasto(g4);

        // 3. Ejecución de la Liquidación (Administrador ID 999)
        int idAdmin = 999;
        LocalDate periodoActual = LocalDate.of(2025, 10, 1);
        LiquidadorDirector director = new LiquidadorDirector(consorcio, idAdmin);

        // CRITERIO A USAR: Pago Completo de Gastos
        CriterioLiquidacion criterioPagoCompleto = new PagoCompletoGastos();
        director.ejecutarLiquidacion(criterioPagoCompleto, periodoActual);
    }
}
