import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    private static HashSet<Album> albumes = new HashSet<>();

    public static HashSet<Album> getAlbumes() {
        return albumes;
    }

    public static void setAlbumes(HashSet<Album> albumes) {
        Main.albumes = albumes;
    }

    public static void main(String[] args) {
        Artista coldplay = new Artista("Coldplay");
        Album album1 = new Album("A Rush of Blood to the Head", 2002, coldplay);
        Album album2 = new Album("Viva la Vida or Death and All His Friends", 2008, coldplay);

        albumes.add(album1);
        albumes.add(album2);

        Popularidad normal = new Normal();
        Cancion theScientist = new Cancion("The Scientist", album1, 0, LocalDate.now(), normal);

        //normal recien creado
        System.out.println(theScientist.verDetalle());

        for (int i = 0; i < 1001; i++) {
            theScientist.reproducir();
        }
        //pasa a estar en auge
        System.out.println(theScientist.verDetalle());

        EnAuge auge = (EnAuge) theScientist.getPopularidad();
        for (int i = 0; i < 5001; i++) {
            auge.aniadirDislikes(theScientist);
        }
        //normal x dislikes
        System.out.println(theScientist.verDetalle());

        theScientist.CambiarEstado(new EnAuge());
        for (int i = 0; i < 50000; i++) {
            theScientist.reproducir();
        }
        theScientist.setLikes(20000);
        theScientist.reproducir();
        //en tendencia
        System.out.println(theScientist.verDetalle());

        //normal no escuchadsa 24hs
        theScientist.reproducir();
        System.out.println(theScientist.verDetalle());

        System.out.println("\nÁlbumes guardados:");
        for (Album album : albumes) {
            System.out.println("- " + album.getNombre() + " (" + album.getAnio() + ") - " + album.getArtista().getNombre());
        }
    }
}
