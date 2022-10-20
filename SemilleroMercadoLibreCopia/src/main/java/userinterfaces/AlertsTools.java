package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AlertsTools extends PageObject
{
    public static final Target BTN_ALERTS_HOME = Target.the("BTN ALERTS, FRAMES & WINDOWS")
            .locatedBy("//*[text()='Alerts, Frame & Windows']");
    public static final Target BTN_BANNERS = Target.the("BTN ALERTS, FRAMES & WINDOWS")
            .locatedBy("//div[@class='home-body']");

    public static final Target BTN_ALERTS_INI = Target.the("BTN ALERTS OPCIONES")
            .locatedBy("//*[text()='Alerts']");

    public static final Target BTN_ALERTS = Target.the("BTN PRIMER ALERTS")
        .locatedBy("//button[@id='alertButton']");
    public static final Target BTN_ALERTS_TIMERS = Target.the("BTN SEGUNDO ALERTS")
            .locatedBy("//button[@id='timerAlertButton']");
    public static final Target BTN_ALERTS_CONFIRM = Target.the("BTN TERCER ALERTS")
            .locatedBy("//button[@id='confirmButton']");
    public static final Target BTN_ALERTS_PROMT = Target.the("BTN CUARTO ALERTS")
            .locatedBy("//button[@id='promtButton']");

}
