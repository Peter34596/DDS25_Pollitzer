package Ej1MqExpep;

public class Producto {
    int precio;
    int nombre;

    public Producto(int precio, int nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
}
