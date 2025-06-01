package Ej3PersonajeVideoJuego;

public class Envenenado extends Esatdo{
    int puntosEnGolpe=0;
    int puntosGolpe=15;
    int puntosNecesitados=75;
    int vecesCorridas=0;
    int maxVecesCorridas=2;

    @Override
    public void cambiarEstado(Personaje p) {
        if(vecesCorridas>maxVecesCorridas && puntosGolpe>puntosNecesitados){
            p.esatdo=new Sano();
        }
    }

    @Override
    protected void caminar() {
        System.out.println("No puedo caminar, solo corro");
    }

    @Override
    protected void correr() {
        System.out.println("Corro en búsqueda de sanos");
        vecesCorridas++;
    }

    @Override
    protected void beber() {
        System.out.println("No necesito más beber");
    }

    @Override
    protected void golper() {
        System.out.println("Mi golpe vale 15 puntos");
        puntosEnGolpe+=puntosGolpe;
    }
}