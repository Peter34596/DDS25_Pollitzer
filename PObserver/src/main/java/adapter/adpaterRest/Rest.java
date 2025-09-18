package adapter.adpaterRest;

import java.util.HashSet;

public class Rest {
    private HashSet<Prod> libreria;

    public HashSet<Prod> getLibreria() {
        return libreria;
    }
    public void setLibreria() {
        this.libreria=new HashSet<>();
    }
    public String Operacion(Prod prod){
        libreria.add(prod);
        return "Reegistro";
    }

}
