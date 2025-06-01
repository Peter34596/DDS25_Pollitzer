package Ej1MqExpep;

import java.util.Scanner;

public class ConDinero implements Estado {

    @Override
    public void cambiarEstado(MaquinaExpendedora me) {
        int eleccion = solicitarOpcion();
        if (eleccion == 1) {
            this.seleccionarProducto(me);
        } else {
            this.devolverDinero(me);
        }
    }
    public static int solicitarOpcion() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Elegir producto (1) o devolución de dinero (0):");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese 1 o 0:");
                scanner.next();
            }
            opcion = scanner.nextInt();

            if (opcion != 0 && opcion != 1) {
                System.out.println("Número inválido. Debe ser 1 o 0.");
            }
        } while (opcion != 0 && opcion != 1);

        return opcion;
    }

    public void seleccionarProducto(MaquinaExpendedora me, Producto producto) {
        if (me.getDineroAcumulado() >= producto.getPrecio()) {
            me.setDineroAcumulado(me.getDineroAcumulado() - producto.getPrecio());
            me.cambiarStock(,1);
            System.out.println("Producto seleccionado: " + producto);
            me.setEstado(new ProdSeleccionado());
        } else {
            System.out.println("Dinero insuficiente para comprar " + producto.getNombre());
        }
    }
    public void devolverDinero(MaquinaExpendedora me) {
        System.out.println("Dinero devuelto: $" + me.getDineroAcumulado());
        me.setDineroAcumulado(0);
        me.setEstado(new SinDinero());
    }
}
