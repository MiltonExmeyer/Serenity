package task;


import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.CrearCuenta.*;

public class IngresarCrearCuenta implements Task
{
    private String email;

    public IngresarCrearCuenta(String email)
    {
        this.email = email;
    }

    public static IngresarCrearCuenta ingresarCrearCuenta(String email)
    {
        //RETORNAR LA INSTANCIACION DE LA CLASE INGRESAR CREAR CUENTA
        return instrumented(IngresarCrearCuenta.class, email);
    }

    //METODO QUE HEREDA EL OBJETO ACTOR DE LA CLASE MERCADOLIBRECUENTASTEP
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        //EL ACTOR EJECUTARA UNA TAREA ATTEMPTSTO
        actor.attemptsTo(
                Click.on(BTN_AUTORIZAR_DATA),
                TiempoEspera.unMomento(1),
                Click.on(BTN_CONTINUAR),
                TiempoEspera.unMomento(1),
                Click.on(BTN_VALIDAR),
                TiempoEspera.unMomento(1),
                Enter.theValue(email).into(INPUT_TXT_EMAIL),
                TiempoEspera.unMomento(2));
    }
}
