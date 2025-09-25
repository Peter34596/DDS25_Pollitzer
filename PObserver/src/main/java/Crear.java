public class Crear {
    private Prod producto;

    public Crear() {
        this.producto = new Prod();
    }

    public void agregarTipo(TipoProd tipoProd){
        this.producto.setTipoProd(tipoProd);
    }

    public void agregarPrecio(double precioBase){
        this.producto.setPrecioBase(precioBase);
    }

    public void agregarNombre(String nombre){
        this.producto.setNombre(nombre);
    }

    public  void agregarDesc(String desc){
        this.producto.setDesc(desc);
    }

    public void agregarCodigo(int barCode){
        this.producto.setBarCode(barCode);
    }

    public Prod construir(){
        if (producto.getPrecioBase() > 1000 && producto.getNombre().length() >= 10 && producto.getDesc() != ""){
            System.out.println("Bien Creado");
            return producto;
        }
        throw new DatosMalException("Los datos son erroneos");
    }


}
