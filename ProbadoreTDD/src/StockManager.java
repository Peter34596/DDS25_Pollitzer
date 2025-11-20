public class StockManager {
    private Evento evento;
    private int entradasDisponibles;
    private int entradasReservadas;

    public StockManager(Evento e) {
        this.evento = e;
        this.entradasDisponibles = e.getEntradasDisp();
        this.entradasReservadas = 0;
    }

    public int entradasDisponibles() {
        return entradasDisponibles;
    }

    public int entradasReservadas() {
        return entradasReservadas;
    }

    public void reservar(int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("Cantidad debe ser positiva");
        if (cantidad > entradasDisponibles) throw new IllegalStateException("No hay suficiente stock disponible");
        entradasDisponibles -= cantidad;
        entradasReservadas += cantidad;
    }

    public void confirmarVenta(int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("Cantidad debe ser positiva");
        if (cantidad > entradasReservadas) throw new IllegalStateException("No hay suficientes reservas para confirmar");
        entradasReservadas -= cantidad;
    }

    public boolean CancelarReservar(int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("Cantidad debe ser positiva");
        if (cantidad > entradasReservadas) throw new IllegalStateException("No hay suficientes reservas para cancelar");
        entradasDisponibles += cantidad;
        entradasReservadas -= cantidad;
        return true;
    }
}
