package Ej2Bebida;

public class Cafe extends Bebida {
    @Override
    protected void HervirAgua() {
        System.out.println("hervir agua 100ª");
    }

    @Override
    protected void SeleccionarInfucion() {
        System.out.println("agarrar cafe elegido");
    }

    @Override
    protected void Disolucion() {
        System.out.println("Ponerlo en la taza con el agua");
    }

    @Override
    protected void Endulsante() {
        System.out.println("Ofrese azucar");
    }
}
