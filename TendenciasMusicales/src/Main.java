import javax.swing.*;
import java.util.HashSet;

public class Main {
    private HashSet<Album> albums;

    public Main() {
        this.albums = new HashSet<>();
    }

    public HashSet<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(HashSet<Album> albums) {
        this.albums = albums;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Artista coldplay = new Artista("Coldplay");
        Album album = new Album("A Rush of Blood to the Head", 2002, coldplay);
        Cancion theScientist = new Cancion("The Scientist", album);
        album.agregarCancion(theScientist);
        main.getAlbums().add(album);

        // Cancion recien salida
        System.out.println(theScientist.obtenerEstado(coldplay, album.getAnio()));

        // cambiar estado a en auge
        for (int i = 0; i < 1001; i++) {
            theScientist.reproducir();
        }
        System.out.println(theScientist.obtenerEstado(coldplay, album.getAnio()));
        //baja del auge
        for (int i = 0; i < 5000; i++) {
            theScientist.agregarDislike();
        }
        System.out.println(theScientist.obtenerEstado(coldplay, album.getAnio()));

        // En tendencia
        for (int i = 0; i < 20001; i++) {
            theScientist.agregarLike();
        }
        for (int i = 0; i < 40000; i++) {
            theScientist.reproducir();
        }
        System.out.println(theScientist.obtenerEstado(coldplay, album.getAnio()));

        //bajar de auge a normal
        for (int i = 0; i < 5000; i++) {
            theScientist.agregarDislike();
        }
        System.out.println(theScientist.obtenerEstado(coldplay, album.getAnio()));

        //Prueba metodo 24hs
    }
}
