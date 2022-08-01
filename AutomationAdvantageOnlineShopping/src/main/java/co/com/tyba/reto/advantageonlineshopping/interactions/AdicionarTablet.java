package co.com.tyba.reto.advantageonlineshopping.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.PopularItems.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class AdicionarTablet implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HP_ELITEPAD_1000_G2_TABLET),
                Click.on(COLOR_TABLET),
                Click.on(ADD_TO_CART),
                WaitUntil.the(CERRAR,isNotVisible()).forNoMoreThan(30).seconds()
        );
    }

    public static AdicionarTablet alCarrito() {
        return instrumented(AdicionarTablet.class);
    }

}
