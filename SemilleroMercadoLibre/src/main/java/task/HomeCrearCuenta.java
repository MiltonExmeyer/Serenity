package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static userinterfaces.HomePage.*;

public class HomeCrearCuenta implements Task {
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        //EL ACTOR EJECUTARA UNA TAREA ATTEMPTSTO
        actor.attemptsTo(
                TiempoEspera.unMomento(1),
                Click.on(BTN_CREATU_CUENTA),
                TiempoEspera.unMomento(1),
                Click.on(BTN_COOKIES),
                TiempoEspera.unMomento(1));
    }
}
