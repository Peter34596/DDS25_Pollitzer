import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThrows;

public class PalindromoTest {

    @Test
    public void ValidarPalindromo() {
        Palabra p = new Palabra("N euQu En  ");
        boolean res = p.validarPalindromo();
        assertTrue(res);
    }

    @Test
    public void NoEsPalindromoDebeLanzarExcepcion() {
        Palabra p = new Palabra("hola");

        assertThrows(IllegalArgumentException.class, () -> {
            p.validarPalindromo();
        });
    }

    @Test
    public void ContieneCaracteresInvalidosDebeLanzarExcepcion() {
        Palabra p = new Palabra("neu Qu 3n");

        assertThrows(IllegalArgumentException.class, () -> {
            p.validarPalindromo();
        });
    }
}
