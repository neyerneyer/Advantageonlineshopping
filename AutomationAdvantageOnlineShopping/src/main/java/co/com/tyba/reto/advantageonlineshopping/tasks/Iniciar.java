package co.com.tyba.reto.advantageonlineshopping.tasks;

import co.com.tyba.reto.advantageonlineshopping.userinterfaces.PaginaAdvantageOnlineShopping;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.Cart.LOADER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class Iniciar implements Task {
    PaginaAdvantageOnlineShopping advantageOnlineShopping;

    public static Iniciar elNavegador() {
        return Tasks.instrumented(Iniciar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(advantageOnlineShopping),
                WaitUntil.angularRequestsHaveFinished(),
                WaitUntil.the(LOADER, isNotVisible()).forNoMoreThan(60).seconds()
        );
    }
}
