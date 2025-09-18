package adapter.adpaterRest;

public class AdapterRest {
    private Rest rest;
    public String Operacion(Prod prod){
        return rest.Operacion(prod);
    }
}
