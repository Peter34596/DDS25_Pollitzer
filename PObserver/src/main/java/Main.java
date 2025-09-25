import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IVA iva = new IVA();
        EO eo = new EO();
        EL el = new EL();
        HashSet<Imp> impuestos = new HashSet<>();
        impuestos.add(iva);
        impuestos.add(eo);
        impuestos.add(el);

        TipoProd tipoProd = new TipoProd(impuestos, "Electrónica");
        HashSet<Prod> libreriaRest = new HashSet<>();
        Rest rest = new Rest(libreriaRest);
        AdapterRest adapterRest = new AdapterRest(rest);

        HashSet<Prod> libreriaApi = new HashSet<>();
        WebApi webApi = new WebApi(libreriaApi);
        AdapterApi adapterApi = new AdapterApi(webApi);

        HashSet<Prod> libreriaOtro = new HashSet<>();
        OtroSist otroSist = new OtroSist(libreriaOtro);
        AdapterOtro adapterOtro = new AdapterOtro(otroSist);
        Deposito deposito = new Deposito(adapterRest);
        OfContable ofContable = new OfContable(adapterApi);
        ContVentas contVentas = new ContVentas(adapterOtro);
        HashSet<IObsever> observers = new HashSet<>();
        observers.add(deposito);
        observers.add(ofContable);
        observers.add(contVentas);

        HashSet<Prod> ventas = new HashSet<>();
        Sucursales sucursal = new Sucursales("Sucursal Centro", "Calle Falsa 123", ventas, observers);
        
        // Ingresar producto por consola y agregarlo a ventas
        Prod prodIngresado = Prod.ingresarProducto(tipoProd);
        if(prodIngresado!=null) {
            ventas.add(prodIngresado);
            System.out.println("Producto ingresado y guardado correctamente");
        }
    }
}
