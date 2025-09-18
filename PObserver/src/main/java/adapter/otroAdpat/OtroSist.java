package adapter.otroAdpat;

import java.util.HashSet;

public class OtroSist {
    
    private HashSet<Prod> libreria;
    
    public HashSet<Prod> getLibreria() {
        return libreria;
    }
    public void setLibreria() {
        this.libreria=new HashSet<>();
    }
    public String Operacion(Prod prod){
        libreria.add(prod);
        return "contando ventas"+libreria.size();
    }
}
