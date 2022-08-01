package co.com.tyba.reto.advantageonlineshopping.interactions;

import co.com.tyba.reto.advantageonlineshopping.models.ModeloSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.RegisterUser.*;
import static co.com.tyba.reto.advantageonlineshopping.utils.UsuarioAleatorio.generarUsuarioAleatorio;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Llenar implements Interaction {
    ModeloSesion login;

    public static Llenar elFormulario() {
        return instrumented(Llenar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("user", generarUsuarioAleatorio());
        actor.attemptsTo(
                Click.on(MENU_USER),
                WaitUntil.the(CREATE_NEW_ACCOUNT, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(CREATE_NEW_ACCOUNT),
                WaitUntil.the(USER_NAME, isEnabled()),
                Enter.theValue(actor.recall("user").toString()).into(USER_NAME),
                Enter.theValue("funezneyer@gmail.com").into(EMAIL),
                Enter.theValue("Bq12345").into(PASSWORD),
                Enter.theValue("Bq12345").into(CONFIRM_PASSWORD),
                Click.on(CHECK_PRIVACY),
                Click.on(BUTTON_REGISTER)
        );
    }
}