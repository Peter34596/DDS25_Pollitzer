import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class CancionTest {
    private Cancion theScientist;

    @BeforeEach
    public void setUp() {
        Artista coldplay = new Artista("Coldplay");
        Album album = new Album("A Rush of Blood to the Head", 2002, coldplay);
        Popularidad normal = new Normal();
        theScientist = new Cancion("The Scientist", album, 0, LocalDate.now(), normal);
    }

    @Test
    public void testCancionInicialmenteNormal() {
        assertTrue(theScientist.getPopularidad() instanceof Normal, "La canción no inicia con estado Normal");
    }

    @Test
    public void testCancionPasaAEnAugePorReproducciones() {
        for (int i = 0; i < 1001; i++) {
            theScientist.reproducir();
        }
        assertTrue(theScientist.getPopularidad() instanceof EnAuge, "La canción no pasó a EnAuge como se esperaba");
    }

    @Test
    public void testCancionCaeDeEnAugePorDislikes() {
        theScientist.CambiarEstado(new EnAuge());
        EnAuge auge = (EnAuge) theScientist.getPopularidad();
        for (int i = 0; i < 5001; i++) {
            auge.aniadirDislikes(theScientist);
        }

        assertTrue(theScientist.getPopularidad() instanceof Normal, "La canción no volvió a Normal tras demasiados dislikes");
    }

    @Test
    public void testCancionPasaATendenciaPorLikesYReproducciones() {
        theScientist.CambiarEstado(new EnAuge());
        for (int i = 0; i < 49999; i++) {
            theScientist.reproducir();
        }
        theScientist.setLikes(20000);
        theScientist.reproducir();
        assertTrue(theScientist.getPopularidad() instanceof Tendencia, "La canción no alcanzó Tendencia correctamente");
    }

    @Test
    public void testCancionVuelveANormalDesdeTendenciaPorTiempo() {
        theScientist.CambiarEstado(new Tendencia());
        theScientist.reproducir(); // Se ejecuta la lógica para volver a Normal
        assertTrue(theScientist.getPopularidad() instanceof Normal, "La canción no volvió a Normal tras la condición de tiempo");
    }
}
