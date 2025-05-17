import java.time.LocalDate;

public class Cancion {
    private String titulo;
    private String album;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private LocalDate ultimaReproduccion;
    private Popularidad popularidad;

    public Cancion(String titulo, String album) {
        this.titulo = titulo;
        this.album = album;
        this.reproducciones = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.ultimaReproduccion = LocalDate.now();
        this.popularidad = Popularidad.NORMAL;
    }
    public Popularidad getPopularidad() {
        return this.popularidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void reproducir() {
        this.reproducciones++;
        this.ultimaReproduccion = LocalDate.now();
        actualizarPopularidad();
    }

    public void agregarLike() {
        this.likes++;
        actualizarPopularidad();
    }

    public void agregarDislike() {
        this.dislikes++;
        actualizarPopularidad();
    }

    private void actualizarPopularidad() {
        if (dislikes >= 5000) {
            popularidad = Popularidad.NORMAL;
        } else if (reproducciones > 50000 && likes > 20000) {
            popularidad = Popularidad.TENDENCIA;
        } else if (reproducciones > 1000) {
            popularidad = Popularidad.EnAUGE;
        } else {
            popularidad = Popularidad.NORMAL;
        }
    }

    public String obtenerEstado(Artista artista, int anioAlbum) {
        String estado = "";
        switch (popularidad) {
            case NORMAL:
                estado = Icono.MUSICAL_NOTE.texto() + "-" + artista.getNombre() + " – " + album + " - " + titulo;
                break;
            case EnAUGE:
                estado = Icono.ROCKET.texto() + "-" + artista.getNombre() + " – " + titulo + " (" + album + " - " + anioAlbum + ")";
                break;
            case TENDENCIA:
                estado = Icono.FIRE.texto() + "-" + titulo + " – " + artista.getNombre() + " (" + album + " - " + anioAlbum + ")";
                break;
        }
        return estado;
    }

    public void verificarTendencia() {
        //METODO 24HS
    }
}
