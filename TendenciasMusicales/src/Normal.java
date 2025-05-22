public class Normal extends Popularidad{
    private int reprosucciones;
    private int num=1000;
    protected String Icono(){
        return Icono.MUSICAL_NOTE.texto();
    }
    protected String Leyenda(Cancion c){
        String f = "";
        f+=c.getAlbum().getArtista().getNombre();
        f+=" ";
        f+=c.getAlbum().getNombre();
        f+=" ";
        f+=c.getTitulo();
        return f;
    }
    public String reproducir(Cancion c){
        this.reprosucciones++;
        if (reprosucciones>num){
            c.CambiarEstado(new EnAuge());
        }
    }

}