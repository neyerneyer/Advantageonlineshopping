package co.com.tyba.reto.advantageonlineshopping.tasks;

import co.com.tyba.reto.advantageonlineshopping.interactions.Pagar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Realizar implements Task {
    public static Realizar compras() {
        return Tasks.instrumented(Realizar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Pagar.productos());
    }
}
