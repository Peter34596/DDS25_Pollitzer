import java.util.HashSet;

public class Album {
    private String nombre;
    private int anio;
    private Artista artista;
    private HashSet<Cancion> canciones;

    public Album(HashSet<Cancion> canciones) {
        this.nombre = "A rush of blood to the head";
        this.anio = 2002;
        this.artista = new Artista();
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public HashSet<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(HashSet<Cancion> canciones) {
        this.canciones = canciones;
    }
}
