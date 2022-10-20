package stepDefinitions;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterfaces.HomePage;

public class MercadoLibreSteps {
    @Managed(driver= "chrome")
    //CREAR AVRIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor= Actor.named("Global");
    //INSTANCIAR LA CLASE HOMEPAGE
    private HomePage homePage=new HomePage();



    @Dado("que un cliente accede a la web y pueda crear una cuenta")
    public void queUnClienteAccedeALaWebYPuedaCrearUnaCuenta() {
        //INDICANDO AL ACTOR QUE PUEDE CREAR UNA CUENTA
        actor.can(BrowseTheWeb.with(driver));

        //EL ACTOR FUE CAPAZ DE INGRESAR
        actor.wasAbleTo(Open.browserOn(homePage));

    }
    @Cuando("el agregar su correo para validar")
    public void elAgregarSuCorreoParaValidar(io.cucumber.datatable.DataTable dataTable) {
    }

    @Entonces("el valida su correo y acepta terminos")
    public void elValidaSuCorreoYAceptaTerminos() {


    }

}
