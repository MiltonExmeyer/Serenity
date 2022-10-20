package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CompraProducto extends PageObject
{
    public static final Target INPUT_TXT_PRODUCTO = Target.the("CUADRO DE BUSQUEDA PRODUCTOS")
            .locatedBy("//input[@id='cb1-edit']");
    public static final Target BTN_BUSCAR = Target.the("LUPA PARA BUSCAR PRODUCTOS")
            .locatedBy("//button[@type='submit']");
    public static final Target BTN_UBICACION = Target.the("CERRAR UBICACION ")
            .locatedBy("//button[@class = 'andes-tooltip-button-close']");
    public static final Target BTN_COOKIES_DOS = Target.the("ACEPTAR COOKIES")
            .locatedBy("//*[text()='Entendido']");
    public static final Target PRIMER_PRODUCTO = Target.the("SELECCIONAR EL PRIMER PRODUCTO")
            .locatedBy("(//img[@class='ui-search-result-image__element shops__image-element'])[1]");
    public static final Target BTN_AGREGAR_CARRITO = Target.the("AGREGAR AL CARRITO")
            .locatedBy("//button[ @class='andes-button andes-spinner__icon-base andes-button--quiet']//span[text()='Agregar al carrito']");
    public static final Target BTN_CREAR_CUENTA = Target.the("OPCION CREAR CUENTA")
            .locatedBy("//span[text()='Crear cuenta']");
}
