public class User {
    private String nombre;
    private StockManager sm;
    public User(String nombre, StockManager sm) {
        this.nombre=nombre;
        this.sm=sm;
    }

    public boolean reservar() {
        sm.reservar(24);
        return true;
    }
    public boolean CancelarReservar() {
        boolean prov= sm.CancelarReservar(12);
        this.sm=null;
        return prov;
    }

}
