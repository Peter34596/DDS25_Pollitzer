import java.util.HashSet;

public class Combo extends Producto{
    private HashSet<Producto> productos;

    public Combo(String descripcion, HashSet<Producto> productos) {
        super(descripcion);
        this.productos = productos;
    }

    public Combo(String descripcion) {
        super(descripcion);
        this.productos = new HashSet<>();
    }

    public void setProductos(HashSet<Producto> productos) {
        this.productos = productos;
    }
    public HashSet<Producto> getProductos() {
        return productos;
    }

    @Override
    public double precio(){
        int precioTotal=0;
        for (Producto prod : productos){
            precioTotal += prod.precio();
        }
        return precioTotal;
    }
    @Override
    public int Stock(){
        boolean inicializado = false;
        int minStock = 0;
        for (Producto prod:productos){
            if(!inicializado){
                minStock = prod.Stock();
                inicializado = true;
            }
            if(prod.Stock() < minStock){
                minStock = prod.Stock();
            }
        }
        return minStock;
    }
    public void agregarProducto(Producto producto1,Producto producto2,Producto producto3){
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }

    public void agregarProducto(Producto comboSimple, Producto piloto) {
        productos.add(comboSimple);
        productos.add(piloto);
    }
}
