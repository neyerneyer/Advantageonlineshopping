package co.com.tyba.reto.advantageonlineshopping.tasks;

import co.com.tyba.reto.advantageonlineshopping.interactions.AdicionarPc;
import co.com.tyba.reto.advantageonlineshopping.interactions.AdicionarSpeaker;
import co.com.tyba.reto.advantageonlineshopping.interactions.AdicionarTablet;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.PopularItems.HOME;
import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.PopularItems.POPULAR_ITEMS;
import static co.com.tyba.reto.advantageonlineshopping.utils.Numeros.SESENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Agregar implements Task {
    public static Agregar productos() {
        return Tasks.instrumented(Agregar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(POPULAR_ITEMS,isClickable()).forNoMoreThan(SESENTA.getNumero()).seconds(),
                Click.on(POPULAR_ITEMS),
                AdicionarSpeaker.alCarrito(),
                Click.on(HOME),
                AdicionarTablet.alCarrito(),
                Click.on(HOME),
                AdicionarPc.alCarrito()
        );
       /*
        actor.attemptsTo(WaitUntil.the(LOADER, isNotVisible()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Click.on(SPEAKERS));
        actor.attemptsTo(Click.on(PRODUCT_NAME.of(speaker)));
        actor.attemptsTo(Click.on(ADD_TO_CART));
        actor.attemptsTo(Click.on(MENU_CART));
        actor.remember("speaker",speaker);
        */
    }

}
