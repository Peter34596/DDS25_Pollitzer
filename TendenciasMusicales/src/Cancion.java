import java.time.LocalDate;

public class Cancion {
    private String titulo;
    private Album album;
    private int likes;
    private LocalDate ultimaReproduccion;
    private Popularidad popularidad;

    public Cancion(String titulo, Album album, int likes, LocalDate ultimaReproduccion, Popularidad popularidad) {
        this.titulo = titulo;
        this.album = album;
        this.likes = likes;
        this.ultimaReproduccion = ultimaReproduccion;
        this.popularidad = popularidad;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Album getAlbum() {
        return album;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }

    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }

    public LocalDate getUltimaReproduccion() {
        return ultimaReproduccion;
    }
    public void setUltimaReproduccion(LocalDate ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
    }

    public Popularidad getPopularidad() {
        return popularidad;
    }
    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }

    public void reproducir() {
    }
    public void verDetalle() {
    }
    public void CambiarEstado(Popularidad p) {
    }

}
