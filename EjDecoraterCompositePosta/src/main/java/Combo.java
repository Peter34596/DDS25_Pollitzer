import java.util.HashSet;

public class Combo extends Producto {
    private HashSet<Producto> productos;

    public Combo(String descripcion, HashSet<Producto> productos) { super(descripcion); this.productos = productos; }
    public Combo(String descripcion) { super(descripcion); this.productos = new HashSet<>(); }
    public void setProductos(HashSet<Producto> productos) { this.productos = productos; }
    public HashSet<Producto> getProductos() { return productos; }
    @Override public double precio() { return productos.stream().mapToDouble(Producto::precio).sum(); }
    @Override public int Stock() { return productos.stream().mapToInt(Producto::Stock).min().orElse(0); }
    public void agregarProducto(Producto... productosAgregar) { for (Producto p : productosAgregar) productos.add(p); }
}
