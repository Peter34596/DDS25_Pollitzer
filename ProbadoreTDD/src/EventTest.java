import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class EventTest {

    @Test
    public void ValidarEvento() {
        Evento e = new Evento("evento1",450);
        StocManager sm = new StocManager(e);
        boolean res = sm.validardisponibilidad();
        assertTrue(res);
    }
    @Test
    public void usuarioresuelvepidereserva(){
        Evento e = new Evento("evento1",450);
        StocManager sm = new StocManager(e);
        User u = new User("nombre",sm);
        boolean res = u.reservar();
        assertTrue(res);
    }
    @Test
    public void usuarioresuelvepideCancelacionDELAreserva(){
        Evento e = new Evento("evento1",450);
        StocManager sm = new StocManager(e);
        User u = new User("nombre",sm);
        boolean res = u.CancelarReservar();
        assertTrue(res);
    }
}
