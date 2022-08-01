package co.com.tyba.reto.advantageonlineshopping.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.PopularItems.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class AdicionarPc implements Interaction {
    public static AdicionarPc alCarrito() {
        return instrumented(AdicionarPc.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HP_ELITEBOOK_FOLIO),
                Click.on(ADD_TO_CART),
                WaitUntil.the(CERRAR,isNotVisible()).forNoMoreThan(30).seconds()
        );
    }
}