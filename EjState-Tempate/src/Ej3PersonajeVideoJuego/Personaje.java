package Ej3PersonajeVideoJuego;

public class Personaje {
    Esatdo esatdo;
    public void cambiarEstado(){
        esatdo.cambiarEstado(this);
    }
    public void caminar(){
        esatdo.caminar();
    }
    public void correr(){
        esatdo.correr();
    }
    public void beber(){
        esatdo.beber();
    }
    public void golper(){
        esatdo.golper();
    }
}
