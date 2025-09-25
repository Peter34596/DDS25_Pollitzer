public class ProductoSimple extends Producto{
    private int precio;
    private int stock;

    public ProductoSimple(String descripcion, int precio, int stock) { super(descripcion); this.precio = precio; this.stock = stock; }
    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override public double precio(){ return getPrecio(); }
    @Override public int Stock(){ return getStock(); }
}
