public class EnAuge extends Popularidad{
    private int reprosucciones;
    private int reprosuccionesTendencia = 50000;
    private int likesTendencia = 20000;
    private int dislikesNormal = 5000;
    private int dislikes;
    protected String Icono(){
        return Icono.ROCKET.texto();
    }
    protected String Leyenda(Cancion c){
        String f = "";
        f+=c.getAlbum().getArtista().getNombre();
        f+=" ";
        f+=c.getTitulo();
        f+=" ( ";
        f+=c.getAlbum().getNombre();
        f+=" - ";
        f+=c.getAlbum().getAnio();
        f+=" ) ";
        return f;
    }
    public void reproducir(Cancion c){
        reprosucciones++;
        if(reprosucciones >= reprosuccionesTendencia && c.getLikes()>=likesTendencia){
            c.CambiarEstado(new Tendencia());
        }
        if(dislikes>=dislikesNormal){
            c.CambiarEstado(new Normal());
        }
    }
    public void aniadirDislikes(Cancion c) {
        dislikes++;
        if (dislikes >= dislikesNormal) {
            c.CambiarEstado(new Normal());
        }
    }
}
