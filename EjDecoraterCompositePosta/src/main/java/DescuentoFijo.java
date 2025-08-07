public class DescuentoFijo extends Descuento{

    public DescuentoFijo(String descripcion, Producto producto, double valor) {
        super(descripcion, producto, valor);
    }

    @Override
    public double precio() {
        return getProducto().precio()- valor;
    }

    @Override
    public int Stock() {
        return getProducto().Stock();
    }
}
