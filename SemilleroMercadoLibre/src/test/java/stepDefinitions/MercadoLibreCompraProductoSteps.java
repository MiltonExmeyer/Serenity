package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.ComprarProducto;
import task.IngresarCrearCuenta;
import userinterfaces.UrlAccesoMercadoLibre;
import userinterfaces.CompraProducto;

public class MercadoLibreCompraProductoSteps {
    @Managed(driver = "chrome")
    //CREAION DE VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor= Actor.named("Global");
    //INSTANCIAR CLASE HOMEPAGE
    private UrlAccesoMercadoLibre urlAccesoMercadoLibre=new UrlAccesoMercadoLibre();
    private CompraProducto compraProducto = new CompraProducto();

    @Dado("que un usuario ingrese a la pagina web elegida")
    public void queUnUsuarioIngreseALaPaginaWebElegida()
    {
        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        actor.can(BrowseTheWeb.with(driver));
        //MAXIMIZAR EL NAVEGADOR
        driver.manage().window().maximize();
        //EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn(urlAccesoMercadoLibre));
    }

    @Cuando("^busque un (.*) he ingrese (.*)")
    public void busqueUnProductoHeIngreseEmail(String producto, String email)
    {
        actor.wasAbleTo(ComprarProducto.comprarProducto(producto));
        actor.wasAbleTo(IngresarCrearCuenta.ingresarCrearCuenta(email));
    }
    @Entonces("podra ralizar la compra")
    public void podraRealizarLaCompra()
    {
    }
}
