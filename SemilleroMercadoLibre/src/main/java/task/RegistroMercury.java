package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.MercuryRegister.*;

public class RegistroMercury implements Task
{
    String fistName, lastName, phone, email, address, city;
    String state, postalCode, country, user, password, confirmPasword;

    public RegistroMercury(String fistName, String lastName, String phone, String email, String address, String city,
                           String state, String postalCode, String country, String user, String password,
                           String confirmPasword)
    {
        this.fistName =fistName;
        this.lastName = lastName;
        this.phone = phone;
        this.email =email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.user= user;
        this.password = password;
        this.confirmPasword = confirmPasword;
    }

    public static RegistroMercury registroMercury(String fistName, String lastName, String phone, String email, String address, String city,
                                                  String state, String postalCode, String country, String user, String password,
                                                  String confirmPasword)
    {
        return instrumented(RegistroMercury.class,fistName, lastName, phone, email, address,
                city, state, postalCode, country, user, password, confirmPasword);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                TiempoEspera.unMomento(1),
                Click.on(BTN_REGISTER),
                TiempoEspera.unMomento(1),
                Enter.theValue(fistName).into(TXT_FIRST_NAME),
                Enter.theValue(lastName).into(TXT_LAST_NAME),
                Enter.theValue(phone).into(TXT_PHONE),
                Enter.theValue(email).into(TXT_EMAIL),
                Enter.theValue(address).into(TXT_ADDRESS),
                Enter.theValue(city).into(TXT_CITY),
                Enter.theValue(state).into(TXT_STATE),
                Enter.theValue(postalCode).into(TXT_POSTAL),

                Click.on(TXT_COUNTY),
                SelectFromOptions.byVisibleText(country).from(TXT_COUNTY),
                //Enter.theValue(country).into(TXT_COUNTY),
                Enter.theValue(user).into(TXT_USER_NAME),
                Enter.theValue(password).into(TXT_PASSWORD),
                Enter.theValue(confirmPasword).into(TXT_CONFIRM_PASSWORD),
                TiempoEspera.unMomento(3),
                Click.on(BTN_ENVIAR),
                TiempoEspera.unMomento(3)
                );
    }
}
