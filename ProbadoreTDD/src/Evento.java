public class Evento {
    private String nombre;
    private int entradasDisp;
    private int entradasMax;

    public Evento(String evento1, int i, int i2) {
        this.entradasDisp=i;
        this.nombre=evento1;
        this.entradasMax=i2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEntradasDisp() {
        return entradasDisp;
    }

    public void setEntradasDisp(int entradasDisp) {
        this.entradasDisp = entradasDisp;
    }

    public boolean validarEvento() {
        return true;
    }

    public int getCapacidadMaxima() {
        return entradasMax;
    }
}
