public class StocManager {
    private Evento evento;
    private int entradasDisp;
    private int entradasVendidas;

    public StocManager(Evento e) {
        this.evento=e;
        this.entradasDisp=e.getEntradasDisp();
        this.entradasVendidas=0;
    }

    public boolean validardisponibilidad() {
        if(entradasDisp>entradasVendidas){
            return true;
        }
        return false;
    }
    public boolean reservar() {
        if(validardisponibilidad()) {
            entradasVendidas += 1;
            entradasDisp -= 1;
            return true;
        }
        return false;
    }
    public boolean CancelarReservar() {
        entradasVendidas -= 1;
        entradasDisp += 1;
        return true;
    }
}
