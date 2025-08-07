public abstract class Producto {
    private String descripcion;

    public Producto(String descripcion) { this.descripcion = descripcion; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public abstract double precio();
    public abstract int Stock();
}
