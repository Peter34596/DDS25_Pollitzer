public class Venta {
    private String cliente;
    private int cantidad;
    private StockManager stock;
    private boolean confirmada = false;
    private boolean cancelada = false;

    public Venta(String cliente, int cantidad, StockManager stock) {
        if (cantidad <= 0) throw new IllegalArgumentException("Cantidad debe ser positiva");
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.stock = stock;
        stock.reservar(cantidad);
    }

    public void confirmar() {
        if (confirmada) return;
        confirmada = true;
        stock.confirmarVenta(cantidad);
    }

    public void cancelar() {
        if (cancelada) return;
        cancelada = true;
        stock.CancelarReservar(cantidad);
    }
}
