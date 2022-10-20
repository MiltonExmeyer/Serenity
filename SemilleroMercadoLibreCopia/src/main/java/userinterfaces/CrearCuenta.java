package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CrearCuenta extends PageObject
{
    public static final Target BTN_AUTORIZAR_DATA = Target.the("AUTORIZACION DE DATOS")
            .locatedBy("//input[@id='terms-and-conds']");
    public static final Target BTN_CONTINUAR = Target.the("BOTON CONTINUAR")
            .locatedBy("//*[text()='Continuar']");
    public static final Target BTN_VALIDAR= Target.the("BOTON VALIDAR")
            .locatedBy("//*[text()='Validar']");
    public static final Target INPUT_TXT_EMAIL= Target.the("CUADRO DE TEXTO PARA INGRESAR EMAIL")
            .locatedBy("//input[@class='andes-form-control__field']");
}
