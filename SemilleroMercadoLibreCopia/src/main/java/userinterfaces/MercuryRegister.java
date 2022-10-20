package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MercuryRegister extends PageObject
{
    public static final Target BTN_REGISTER = Target.the("BTN REGISTER")
            .locatedBy("//*[text()='REGISTER']");
    public static final Target TXT_FIRST_NAME = Target.the("CAMPO DE TEXTO PRIMER NOMBRE")
            .locatedBy("//input[@name='firstName']");
    public static final Target TXT_LAST_NAME = Target.the("CAMPO DE TEXTO APELLIDO")
            .locatedBy("//input[@name='lastName']");
    public static final Target TXT_PHONE = Target.the("CAMPO DE TEXTO CELULAR")
            .locatedBy("//input[@name='phone']");
    public static final Target TXT_EMAIL = Target.the("CAMPO DE TEXTO CORREO")
            .locatedBy("//input[@name='userName']");
    public static final Target TXT_ADDRESS = Target.the("CAMPO DE TEXTO DIRECCION")
            .locatedBy("//input[@name='address1']");
    public static final Target TXT_CITY = Target.the("CAMPO DE TEXTO CIUDAD")
            .locatedBy("//input[@name='city']");
    public static final Target TXT_STATE = Target.the("CAMPO DE TEXTO ESTADO")
            .locatedBy("//input[@name='state']");
    public static final Target TXT_POSTAL = Target.the("CAMPO DE TEXTO CODIGO POSTAL")
            .locatedBy("//input[@name='postalCode']");
    public static final Target TXT_COUNTY = Target.the("CAMPO DE TEXTO PAIS")
            .locatedBy("//select[@name='country']");
    public static final Target TXT_USER_NAME = Target.the("CAMPO DE TEXTO USER")
            .locatedBy("//input[@name='email']");
    public static final Target TXT_PASSWORD = Target.the("CAMPO DE TEXTO CONTRASEÑA")
            .locatedBy("//input[@name='password']");
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("CAMPO DE TEXTO CONFIRMAR CONTRASEÑA")
            .locatedBy("//input[@name='confirmPassword']");

    public static final Target BTN_ENVIAR = Target.the("BOTON ENVIAR DATA")
            .locatedBy("//input[@name='submit']");

}
