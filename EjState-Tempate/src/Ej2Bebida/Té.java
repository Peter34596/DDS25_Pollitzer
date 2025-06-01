package Ej2Bebida;

public class Té extends Bebida {
    @Override
    protected void HervirAgua() {
        System.out.println("hervir agua 65ª");
    }

    @Override
    protected void SeleccionarInfucion() {
        System.out.println("agarrar te elegido");
    }

    @Override
    protected void Disolucion() {
        System.out.println("Ponerlo en la taza con el agua");
    }

    @Override
    protected void Endulsante() {
        System.out.println("Ofrese miel/edulcorante");
    }
}
