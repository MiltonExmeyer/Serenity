package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;
import nonapi.io.github.classgraph.utils.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.devtools.v85.input.model.TimeSinceEpoch;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.AlertsTools.*;


public class AlertTools implements Task
{
    private String input;
    public AlertTools(String input)
    {
        this.input= input;
    }

    public static Performable alertTools(String input)
    {
        return instrumented(AlertTools.class, input);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(

                TiempoEspera.unMomento(1),
                Scroll.to(BTN_BANNERS),
                Click.on(BTN_ALERTS_HOME),
                TiempoEspera.unMomento(1),
                Scroll.to(BTN_ALERTS_INI),
                Click.on(BTN_ALERTS_INI),
                TiempoEspera.unMomento(2),

                //ALERT 1
                TiempoEspera.unMomento(1),
                Click.on(BTN_ALERTS),
                TiempoEspera.unMomento(2));
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
                actor.attemptsTo(TiempoEspera.unMomento(2));

                //ALERT 2
                actor.attemptsTo(
                        TiempoEspera.unMomento(2),
                        Click.on(BTN_ALERTS_TIMERS),
                        TiempoEspera.unMomento(6));
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

                //ALERT 3
                actor.attemptsTo(
                        TiempoEspera.unMomento(2),
                        Click.on(BTN_ALERTS_CONFIRM));
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

                actor.attemptsTo(
                        TiempoEspera.unMomento(2),
                        Click.on(BTN_ALERTS_CONFIRM));
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();

                //ALERT 4
                actor.attemptsTo(
                        TiempoEspera.unMomento(2),
                        Scroll.to(BTN_ALERTS),
                        Click.on(BTN_ALERTS_PROMT),
                        TiempoEspera.unMomento(1));

                Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
                alert.sendKeys(input);
                TiempoEspera.unMomento(2);

                BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
                actor.attemptsTo(TiempoEspera.unMomento(5));
    }
}
