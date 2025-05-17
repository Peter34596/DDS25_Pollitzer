import java.time.LocalDate;

public class Cancion {
    private String titulo;
    private Album album;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private LocalDate ultimaReproduccion;
    private Popularidad popularidad;

    public Cancion(String titulo, Album album) {
        this.titulo = titulo;
        this.album = album;
        this.reproducciones = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.ultimaReproduccion = LocalDate.now();
        this.popularidad = Popularidad.NORMAL;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    public Popularidad getPopularidad() {
        return this.popularidad;
    }
    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getUltimaReproduccion() {
        return ultimaReproduccion;
    }

    public void setUltimaReproduccion(LocalDate ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
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
