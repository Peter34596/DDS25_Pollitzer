import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventoTest {
    private Evento evento;
    private StockManager stock;

    @Before
    public void setUp() {
        evento = new Evento("Expo Videojuegos", 100,1000);
        stock = new StockManager(evento);
    }

    @Test
    public void testEventoTieneNombreYCapacidad() {
        assertEquals("Expo Videojuegos", evento.getNombre());
        assertEquals(1000, evento.getCapacidadMaxima());
    }

    @Test
    public void testStockInicialDisponible() {
        assertEquals(100, stock.entradasDisponibles());
        assertEquals(0, stock.entradasReservadas());
    }

    @Test
    public void testReservarEntradasDescuentaDelStock() {
        stock.reservar(10);
        assertEquals(90, stock.entradasDisponibles());
        assertEquals(10, stock.entradasReservadas());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoSePuedeReservarCantidadNegativa() {
        stock.reservar(-5);
    }

    @Test(expected = IllegalStateException.class)
    public void testNoSePuedeReservarMasQueElStockDisponible() {
        stock.reservar(101);
    }

    @Test
    public void testCancelarReservaDevuelveEntradasAlStock() {
        stock.reservar(20);
        stock.CancelarReservar(10);
        assertEquals(90, stock.entradasDisponibles());
        assertEquals(10, stock.entradasReservadas());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoSePuedeCancelarReservaNegativa() {
        stock.CancelarReservar(-3);
    }

    @Test(expected = IllegalStateException.class)
    public void testNoSePuedeCancelarMasReservasQueLasReservadas() {
        stock.reservar(5);
        stock.CancelarReservar(10);
    }

    @Test
    public void testConfirmarVentaDescuentaReservadas() {
        stock.reservar(15);
        Venta venta = new Venta("Pedro", 15, stock);
        venta.confirmar();
        assertEquals(70, stock.entradasDisponibles());
        assertEquals(15, stock.entradasReservadas());
    }

    @Test
    public void testCancelarVentaDevuelveReservadas() {
        stock.reservar(8);
        Venta venta = new Venta("Ana", 8, stock);
        venta.cancelar();
        assertEquals(92, stock.entradasDisponibles());
        assertEquals(8, stock.entradasReservadas());
    }
}
