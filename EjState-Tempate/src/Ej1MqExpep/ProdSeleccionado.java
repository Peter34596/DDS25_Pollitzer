package Ej1MqExpep;

import java.util.Map;

public class ProdSeleccionado implements Estado {

    @Override
    public void cambiarEstado(MaquinaExpendedora me) {
        me.setEstado(new SinDinero());
    }
}
