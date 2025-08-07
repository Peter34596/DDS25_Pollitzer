public class Packaging extends Aplicalble {
    double precio;

    public Packaging(String descripcion, Producto producto, double precio) { super(descripcion, producto); this.precio = precio; }

    public double getprecio() { return precio; }

    public void setprecio(double precio) { this.precio = precio; }

    @Override
    public double precio() { return precio + getProducto().precio(); }

    @Override
    public int Stock() { return getProducto().Stock(); }
}
