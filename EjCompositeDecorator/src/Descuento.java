public class Descuento extends Aplicalble{
    int valor;

    public Descuento(String descripcion, Producto producto, int valor) {
        super(descripcion, producto);
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public double precio() {
        return valor;
    }

    @Override
    public int Stock() {
        return 0;
    }

    @Override
    public double precioFinal(){
        return precio() +  getProducto().precio();
    }
}
