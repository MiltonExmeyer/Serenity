package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.CompraProducto.*;

public class ComprarProducto implements Task
{
    private String producto;
    public ComprarProducto(String producto)
    {
        this.producto=producto;
    }
    public static ComprarProducto comprarProducto(String producto)
    {
        //RETORNAR LA INSTANCIACION DE LA CLASE INGRESAR CREAR CUENTA
        return instrumented(ComprarProducto.class, producto);
    }
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        //EL ACTOR EJECUTARA UNA TAREA ATTEMPTSTO
        actor.attemptsTo(
                TiempoEspera.unMomento(1),
                Enter.theValue(producto).into(INPUT_TXT_PRODUCTO),
                Click.on(BTN_BUSCAR),
                TiempoEspera.unMomento(1),
                Click.on(BTN_COOKIES_DOS),
                TiempoEspera.unMomento(1),
                Click.on(BTN_UBICACION),
                TiempoEspera.unMomento(1),
                Click.on(PRIMER_PRODUCTO),
                TiempoEspera.unMomento(1),
                Click.on(BTN_AGREGAR_CARRITO),
                TiempoEspera.unMomento(1),
                Click.on(BTN_CREAR_CUENTA),
                TiempoEspera.unMomento(1)
        );
    }
}
