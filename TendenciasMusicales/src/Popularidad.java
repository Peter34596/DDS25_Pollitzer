public abstract class Popularidad {
    protected abstract String Icono();
    protected abstract String Leyenda(Cancion c);
    public abstract String reproducir(Cancion c);
    public String verDetalle(Cancion c) {
        String detalle = "";
        detalle += " ";
        detalle += this.Icono();
        detalle += " ";
        detalle += this.Leyenda(c);
        return detalle;
    }
}