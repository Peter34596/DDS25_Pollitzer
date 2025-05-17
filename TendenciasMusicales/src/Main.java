import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Artista coldplay = new Artista("Coldplay");
        Album album = new Album("A Rush of Blood to the Head", 2002, coldplay);
        Cancion theScientist = new Cancion("The Scientist", album.getNombre());

        album.agregarCancion(theScientist);

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
