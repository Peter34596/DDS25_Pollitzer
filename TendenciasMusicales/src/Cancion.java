import java.time.LocalDate;
import java.util.Date;

public class Cancion {
    private String nombre;
    private String leyenda;
    private Icono icono;
    private Popularidad popularidad;
    private int dislikes;
    private int likes;
    private int reproducciones;
    private int reproduccionesEsperadas;
    private LocalDate ultimaReproduccion;

    public Cancion(String leyenda, Icono icono, Popularidad popularidad, int dislikes, int likes, int reproducciones ,int reproduccionesEsperadas, LocalDate ultimaReproduccion) {
        this.nombre = "The Scientis";
        this.leyenda = leyenda;
        this.icono = icono;
        this.popularidad = popularidad;
        this.dislikes = dislikes;
        this.likes = likes;
        this.reproducciones = reproducciones;
        this.reproduccionesEsperadas = reproduccionesEsperadas;
        this.ultimaReproduccion = ultimaReproduccion;
    }
}
