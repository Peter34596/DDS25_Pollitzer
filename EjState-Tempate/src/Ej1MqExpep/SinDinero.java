package Ej1MqExpep;

import Ej3PersonajeVideoJuego.Esatdo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SinDinero implements Estado {
    @Override
    public void cambiarEstado(MaquinaExpendedora me) {
        for (Map.Entry<Integer, HashMap<Producto, Integer>> entry : me.getStock().entrySet()) {
            System.out.println("Producto: " + entry.getKey() + " - Stock: " + entry.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        Integer ingresarCantidad = Integer.valueOf(scanner.nextLine());
        this.ingresarDinero(me, ingresarCantidad);
    }

    public void ingresarDinero(MaquinaExpendedora me, int cantidad) {
        me.setDineroAcumulado(cantidad);
        System.out.println("Dinero insertado: $" + cantidad);
        me.setEstado(new ConDinero());
    }
}
