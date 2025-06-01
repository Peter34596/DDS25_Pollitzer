package Ej3PersonajeVideoJuego;

public class Sano extends Esatdo{
    int vecesCaminadas=0;
    static int maxVecesCaminadas=5;
    boolean goleo=false;
    @Override
    public void cambiarEstado(Personaje p) {
        if (vecesCaminadas>maxVecesCaminadas && !goleo){
            p.esatdo=new Herido();
        }
    }

    @Override
    protected void caminar() {
        System.out.println("Yendo al objetivo");
        vecesCaminadas++;
    }

    @Override
    protected void correr() {
        System.out.println("Corro a 5m/m");
    }

    @Override
    protected void beber() {
        System.out.println("Ganando resistencia");
    }

    @Override
    protected void golper() {
        System.out.println("Mi golpe vale 15 puntos");
        goleo=true;
    }
}

// si es que tiene que golper cada 5 caminatas habria que hacer mas ifs