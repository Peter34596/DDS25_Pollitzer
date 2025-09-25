public class Prod {
    private TipoProd tipoProd;
    private double precioBase;
    private String nombre;
    private String desc;
    private int barCode;

    public Prod(TipoProd tipoProd, double precioBase, String nombre, String desc, int barCode) {
        this.tipoProd = tipoProd;
        this.precioBase = precioBase;
        this.nombre = nombre;
        this.desc = desc;
        this.barCode = barCode;
    }

    public TipoProd getTipoProd() {
        return tipoProd;
    }
    public void setTipoProd(TipoProd tipoProd) {
        this.tipoProd = tipoProd;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public int getBarCode() {
        return barCode;
    }
    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public double PrecioFinal(){
        double precioFinal = precioBase + tipoProd.CalcularImpuestos(precioBase);
        return  precioFinal;
    }
}
