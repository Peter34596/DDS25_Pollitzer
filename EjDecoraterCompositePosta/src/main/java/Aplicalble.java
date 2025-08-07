public abstract class Aplicalble extends Producto {
    private Producto producto;

    public Aplicalble(String descripcion, Producto producto) { super(descripcion); this.producto = producto; }
    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
    public abstract double precio();
}
