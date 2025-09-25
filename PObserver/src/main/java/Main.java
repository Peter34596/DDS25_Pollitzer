public class Main {
    public static void main(String[] args) {
        // Crear impuestos
        IVA iva = new IVA();
        EO eo = new EO();
        EL el = new EL();
        java.util.HashSet<Imp> impuestos = new java.util.HashSet<>();
        impuestos.add(iva);
        impuestos.add(eo);
        impuestos.add(el);

        // Crear tipo de producto
        TipoProd tipoProd = new TipoProd(impuestos, "Electrónica");

        // Crear producto
        Prod prod = new Prod(tipoProd, 1000.0, "Notebook", "Laptop 15 pulgadas", 12345);

        // Crear sistemas externos y adapters
        java.util.HashSet<Prod> libreriaRest = new java.util.HashSet<>();
        Rest rest = new Rest(libreriaRest);
        AdapterRest adapterRest = new AdapterRest(rest);

        java.util.HashSet<Prod> libreriaApi = new java.util.HashSet<>();
        WebApi webApi = new WebApi(libreriaApi);
        AdapterApi adapterApi = new AdapterApi(webApi);

        java.util.HashSet<Prod> libreriaOtro = new java.util.HashSet<>();
        OtroSist otroSist = new OtroSist(libreriaOtro);
        AdapterOtro adapterOtro = new AdapterOtro(otroSist);

        // Crear observers
        Deposito deposito = new Deposito(adapterRest);
        OfContable ofContable = new OfContable(adapterApi);
        ContVentas contVentas = new ContVentas(adapterOtro);

        // Crear lista de observers
        java.util.HashSet<IObsever> observers = new java.util.HashSet<>();
        observers.add(deposito);
        observers.add(ofContable);
        observers.add(contVentas);

        // Crear lista de ventas
        java.util.HashSet<Prod> ventas = new java.util.HashSet<>();

        // Crear sucursal
        Sucursales sucursal = new Sucursales("Sucursal Centro", "Calle Falsa 123", ventas, observers);

        // Simular venta y notificar observers
        System.out.println("Precio final del producto: " + prod.PrecioFinal());
        for (IObsever obs : observers) {
            String resultado = obs.notificacion(prod);
            System.out.println("Notificación observer: " + resultado);
        }


        Crear c1 = new Crear();
        c1.agregarTipo(tipoProd);
        c1.agregarDesc("");
        c1.agregarPrecio(1021);
        c1.agregarNombre("papitas Saladas");
        c1.agregarCodigo(102122);
        try {
            Prod producroCreado1 = c1.construir();
        }catch (DatosMalException dme){
            dme.printStackTrace();
            dme.getMessage();
        }

        Crear c2 = new Crear();
        c2.agregarTipo(tipoProd);
        c2.agregarDesc("ggggg");
        c2.agregarPrecio(1021);
        c2.agregarNombre("papitas Saladas");
        c2.agregarCodigo(102122);

        try {
            Prod producroCreado2 = c2.construir();
        }catch (DatosMalException dme){
            dme.printStackTrace();
            dme.getMessage();
        }
    }
}
 