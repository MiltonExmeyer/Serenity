package stepDefinitions;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.RegistroMercury;
import userinterfaces.MercuryRegister;
import userinterfaces.UrlAccesoMercury;

public class MercurySteps {
    @Managed(driver = "chrome")
    //CREAION DE VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor= Actor.named("Global");
    //INSTANCIAR CLASE HOMEPAGE
    private UrlAccesoMercury urlAccesoMercury=new UrlAccesoMercury();
    private MercuryRegister mercuryRegister = new MercuryRegister();

    @Dado("que un usuario ingrese a la pagina web he ingrese a register")
    public void queUnUsuarioIngreseALaPaginaWebHeIngreseARegister()
    {
        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        actor.can(BrowseTheWeb.with(driver));
        //MAXIMIZAR EL NAVEGADOR
        driver.manage().window().maximize();
        //EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn(urlAccesoMercury));
    }

    @Cuando ("^ingrese sus datos (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) y (.*)")
    public void ingreseSusDatosFistNameLastNamePhoneEmailAddressCityStatePostalCodeCountryUserPasswordYConfirmPasword(String firstName,
                                                                                                                      String lastName, String phone, String email, String address,
                                                                                                                      String city, String state, String postalCode,String country,
                                                                                                                      String user, String password, String confirmPasword)
    {
        actor.wasAbleTo(RegistroMercury.registroMercury(firstName, lastName, phone, email, address, city,
                state, postalCode, country, user, password, confirmPasword));
    }

    @Entonces("el usuario se encuentra registrado")
    public void elUsuarioSeEncuentraRegistrado()
    {

    }

}
