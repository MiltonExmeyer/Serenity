package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.AlertTools;
import userinterfaces.AlertsTools;
import userinterfaces.UrlAccesoToolsQa;

public class ToolsQaAlertsSteps {

    @Managed(driver = "chrome")
    //CREAION DE VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor= Actor.named("Global");
    //INSTANCIAR CLASE HOMEPAGE
    private UrlAccesoToolsQa urlAccesoToolsQa=new UrlAccesoToolsQa();
    private AlertsTools alertsTools = new AlertsTools();

    @Dado("que un usuario ingrese a la pagina web toolsQa, seccion alerts")
    public void queUnUsuarioIngreseALaPaginaWeBToolsQaSeccionAlerts()
    {
        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        actor.can(BrowseTheWeb.with(driver));
        //MAXIMIZAR EL NAVEGADOR
        driver.manage().window().maximize();
        //EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn(urlAccesoToolsQa));
    }

    @Cuando("^selecciones el ultimo alert podra ingresar (.*) en este")
    public void seleccionesElUltimoAlertPodraIngresarInputEnEste(String input)
    {
        actor.wasAbleTo(AlertTools.alertTools(input));
    }

    @Entonces("el usuario vera el texto ingresado")
    public void elUsuarioVeraElTextoIngresado()
    {

    }

}
