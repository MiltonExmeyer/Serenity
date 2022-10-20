package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.HomeCrearCuenta;
import task.IngresarCrearCuenta;
import userinterfaces.UrlAccesoMercadoLibre;
import userinterfaces.HomePage;
import userinterfaces.CrearCuenta;

public class MeradoLibreCuentaSteps {
    @Managed(driver = "chrome")
    //CREAION DE VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor= Actor.named("Global");
    //INSTANCIAR CLASE HOMEPAGE
    private UrlAccesoMercadoLibre urlAcceso=new UrlAccesoMercadoLibre();
    private HomePage homePage=new HomePage();
    private CrearCuenta crearCuenta=new CrearCuenta();

    @Dado("que un usuario ingrese a la pagina web")
    public void queUnUsuarioIngreseALaPaginaWeb()
    {
        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        actor.can(BrowseTheWeb.with(driver));
        //MAXIMIZAR EL NAVEGADOR
        driver.manage().window().maximize();
        //EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn(urlAcceso));
    }
    @Cuando("ingresa a crear tu cuenta")
    public void ingresaACrearTuCuenta()
    {
        actor.wasAbleTo(new HomeCrearCuenta());
    }

    @Entonces("^tiene la opcion de ingresar email (.*)")
    public void tieneLaOpcionDeIngresarEmail(String email)
    {
        actor.wasAbleTo(IngresarCrearCuenta.ingresarCrearCuenta(email));
    }
}
