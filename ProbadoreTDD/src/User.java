public class User {
    private String nombre;
    private StocManager sm;
    public User(String nombre, StocManager sm) {
        this.nombre=nombre;
        this.sm=sm;
    }

    public boolean reservar() {
        return sm.reservar();
    }
    public boolean CancelarReservar() {
        boolean prov= sm.CancelarReservar();
        this.sm=null;
        return prov;
    }

}
