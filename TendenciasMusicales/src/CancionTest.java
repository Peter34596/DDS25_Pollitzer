import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CancionTest {

    @Test
    public void testReproduccionesSuperanMil() {
        Artista coldplay = new Artista("Coldplay");
        Album album = new Album("A Rush of Blood to the Head", 2002, coldplay);
        Cancion cancion = new Cancion("The Scientist", album);
        Artista artista = new Artista("Coldplay");

        for (int i = 0; i < 1001; i++) {
            cancion.reproducir();
        }
        assertEquals(Popularidad.EnAUGE, cancion.getPopularidad());
    }

    @Test
    public void testCancionBajaDeAugePorDislikes() {
        Artista coldplay = new Artista("Coldplay");
        Album album = new Album("A Rush of Blood to the Head", 2002, coldplay);
        Cancion cancion = new Cancion("The Scientist", album);

        for (int i = 0; i < 5000; i++) {
            cancion.agregarDislike();
        }
        assertEquals(Popularidad.NORMAL, cancion.getPopularidad());
    }

    @Test
    public void testCancionSubeATendencia() {
        Artista coldplay = new Artista("Coldplay");
        Album album = new Album("A Rush of Blood to the Head", 2002, coldplay);
        Cancion cancion = new Cancion("The Scientist", album);

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
