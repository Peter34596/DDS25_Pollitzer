public class Packaging extends Aplicalble{
    double precio;

    public Packaging(String descripcion, Producto producto, double precio) {
        super(descripcion, producto);
        this.precio = precio;
    }

    public double getprecio() {
        return precio;
    }

    public void setprecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double precio() {
        return getprecio();
    }

    @Override
    public int Stock() {
        return 0;
    }
    @Override
    public double precioFinal(){
        return precio + getProducto().precio();
    }
}
