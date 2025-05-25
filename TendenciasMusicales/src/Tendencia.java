public class Tendencia extends Popularidad{
    protected String Icono(){
        return Icono.FIRE.texto();
    }
    protected String Leyenda(Cancion c){
        String f = "";
        f+=c.getTitulo();
        f+=" - ";
        f+=c.getAlbum().getArtista().getNombre();
        f+=" ( ";
        f+=c.getAlbum().getNombre();
        f+=" - ";
        f+=c.getAlbum().getAnio();
        f+=" ) ";
        return f;
    }
    public void reproducir(Cancion c){
        //if comprobndo las 24hs
        c.CambiarEstado(new Normal());
    }
}