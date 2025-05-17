import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CancionTest {

    @Test
    public void testReproduccionesSuperanMil() {
        Cancion cancion = new Cancion("The Scientist", "A Rush of Blood to the Head");
        Artista artista = new Artista("Coldplay");

        for (int i = 0; i < 1001; i++) {
            cancion.reproducir();
        }
        assertEquals(Popularidad.EnAUGE, cancion.getPopularidad());
    }

    @Test
    public void testCancionBajaDeAugePorDislikes() {
        Cancion cancion = new Cancion("The Scientist", "A Rush of Blood to the Head");

        for (int i = 0; i < 5000; i++) {
            cancion.agregarDislike();
        }
        assertEquals(Popularidad.NORMAL, cancion.getPopularidad());
    }

    @Test
    public void testCancionSubeATendencia() {
        Cancion cancion = new Cancion("The Scientist", "A Rush of Blood to the Head");

        for (int i = 0; i < 50001; i++) {
            cancion.reproducir();
        }
        for (int i = 0; i < 20001; i++) {
            cancion.agregarLike();
        }
        assertEquals(Popularidad.TENDENCIA, cancion.getPopularidad());
    }

    @Test
    public void testCancionVuelveANormalTras24Horas() {
        System.out.println("metodo24s");
    }
}
