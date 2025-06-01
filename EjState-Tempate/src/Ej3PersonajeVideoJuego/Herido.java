package Ej3PersonajeVideoJuego;

public class Herido extends Esatdo{
    int vecesCaminadas=0;
    static int maxVecesCaminadas=15;
    boolean tomoPosicon=false;

    @Override
    public void cambiarEstado(Personaje p) {
        if(vecesCaminadas>maxVecesCaminadas && !tomoPosicon){
            p.esatdo=new Envenenado();
        } else if (tomoPosicon) {
            p.esatdo=new Sano();
        }
    }

    @Override
    protected void caminar() {
        System.out.println("Buscando vendajes");
        vecesCaminadas++;
    }

    @Override
    protected void correr() {
        System.out.println("No puedo correr");
    }

    @Override
    protected void beber() {
        System.out.println("Recuperándome");
        tomoPosicon=true;
    }

    @Override
    protected void golper() {
        System.out.println("No tengo suficiente energía");
    }
}
