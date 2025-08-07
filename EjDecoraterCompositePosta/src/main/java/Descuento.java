public class Descuento extends Aplicalble {
    double valor;

    public Descuento(String descripcion, Producto producto, double valor) { super(descripcion, producto); this.valor = valor; }

    public double getValor() { return valor; }

    public void setValor(double valor) { this.valor = valor; }

    @Override
    public double precio() { return getProducto().precio() - valor; }

    @Override
    public int Stock() { return getProducto().Stock(); }
}
