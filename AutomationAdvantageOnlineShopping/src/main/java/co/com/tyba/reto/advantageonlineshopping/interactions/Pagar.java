package co.com.tyba.reto.advantageonlineshopping.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.checkerframework.checker.units.qual.C;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.Cart.*;
import static co.com.tyba.reto.advantageonlineshopping.utils.Numeros.SESENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Pagar implements Interaction {
    public static Pagar productos() {
        return Tasks.instrumented(Pagar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SHOPPING_CART,isVisible()).forNoMoreThan(SESENTA.getNumero()).seconds(),
                Click.on(SHOPPING_CART),
                Click.on(CHECKOUT),
                Click.on(NEXT_PAYMENT),
                Enter.theValue(actor.recall("user").toString()).into(SAFE_USER_PAYMENT),
                Enter.theValue("Bq12345").into(SAFE_PASS_PAYMENT),
                Click.on(PAY_NOW)

        );
    }
}
