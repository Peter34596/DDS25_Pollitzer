package Ej3PersonajeVideoJuego;

public  abstract class Esatdo {
    public abstract void cambiarEstado(Personaje p);
    protected abstract void caminar();
    protected abstract void correr();
    protected abstract void beber();
    protected abstract void golper();
}

