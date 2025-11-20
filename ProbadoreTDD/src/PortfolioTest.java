import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class PortfolioTest {
    private Cuenta cuenta1;
    private Cuenta cuenta2;
    private Portfolio portfolio;

    @Before
    public void setUp() {
        cuenta1 = new Cuenta(100);
        cuenta2 = new Cuenta(200);
        portfolio = new Portfolio();
    }

    @Test
    public void testAgregarCuentasYBalance() {
        portfolio.agregar(cuenta1);
        portfolio.agregar(cuenta2);
        assertEquals(300, portfolio.getBalance());
    }

    @Test
    public void testAgregarPortfolioDentroDePortfolio() {
        Portfolio subPortfolio = new Portfolio();
        subPortfolio.agregar(cuenta1);
        portfolio.agregar(subPortfolio);
        portfolio.agregar(cuenta2);
        assertEquals(300, portfolio.getBalance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoSePuedeAgregarNodoRepetido() {
        portfolio.agregar(cuenta1);
        portfolio.agregar(cuenta1);
    }

    @Test
    public void testTransaccionesDePortfolio() {
        cuenta1.registrarTransaccion("Depósito $50");
        cuenta2.registrarTransaccion("Retiro $20");
        portfolio.agregar(cuenta1);
        portfolio.agregar(cuenta2);
        List<String> transacciones = portfolio.transacciones();
        assertTrue(transacciones.contains("Depósito $50"));
        assertTrue(transacciones.contains("Retiro $20"));
    }

    @Test
    public void testHaRegistradoTransaccion() {
        cuenta1.registrarTransaccion("Depósito $50");
        portfolio.agregar(cuenta1);
        assertTrue(portfolio.haRegistrado("Depósito $50"));
        assertFalse(portfolio.haRegistrado("Retiro $20"));
    }
}