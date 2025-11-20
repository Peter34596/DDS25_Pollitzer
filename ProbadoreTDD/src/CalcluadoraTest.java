import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcluadoraTest {
    private Calcluadora c;

    @Before
    public void INICIAR() {
        c = new Calcluadora();
    }

    @Test
    public void TESTsumar2POSI() {
        assertEquals(5, c.sumar(2, 3));
    }

    @Test
    public void TESTsumar2neg() {
        assertEquals(-5, c.sumar(-2, -3));
    }

    @Test
    public void TESTsumar() {
        assertEquals(1, c.sumar(-2, 3));
    }

    @Test
    public void TESTRESTAR() {
        assertEquals(-5, c.restar(-2, 3));
    }

    @Test
    public void TESTRESTAR2POSIT() {
        assertEquals(-1, c.restar(2, 3));
    }

    @Test
    public void TESTRESTAR2NEGA() {
        assertEquals(1, c.restar(-2, -3));
    }

    @Test
    public void TESTMULTI() {
        assertEquals(-6, c.multiplicar(-2, 3));
    }

    @Test
    public void TESTMULTI2POSIT() {
        assertEquals(6, c.multiplicar(2, 3));
    }

    @Test
    public void TESTMULTI2NEGA() {
        assertEquals(6, c.multiplicar(-2, -3));
    }

    @Test
    public void TESTDIVI() {
        assertEquals(-2, c.dividir(-6, 3));
    }

    @Test
    public void TESTDIVI2POSIT() {
        assertEquals(2, c.dividir(6, 3));
    }

    @Test
    public void TESTDIVI2NEGA() {
        assertEquals(2, c.dividir(-6, -3));
    }

    @Test(expected = ArithmeticException.class)
    public void TESTDIVIDIRporCERO() {
        c.dividir(5, 0);
    }
}