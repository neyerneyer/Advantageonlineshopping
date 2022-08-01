package co.com.tyba.reto.advantageonlineshopping.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.PopularItems.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AdicionarSpeaker implements Interaction {
    public static AdicionarSpeaker alCarrito() {
        return instrumented(AdicionarSpeaker.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HP_ROAR_PLUS_WIRELESS_SPEAKER),
                Click.on(COLOR_SPEAKER),
                Click.on(ADD_TO_CART),
                WaitUntil.the(CERRAR,isNotVisible()).forNoMoreThan(30).seconds()
        );
    }
}