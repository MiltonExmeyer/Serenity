package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject
{
    public static final Target BTN_CREATU_CUENTA = Target.the("INGRESAR A CREAR TU CUENTA")
            .locatedBy("//a[@data-link-id='registration']");
    public static final Target BTN_COOKIES = Target.the("ACEPTAR COOKIES")
            .locatedBy("//*[text()='Entendido']");
}
