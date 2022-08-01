package co.com.tyba.reto.advantageonlineshopping.tasks;

import co.com.tyba.reto.advantageonlineshopping.interactions.Llenar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Crear implements Task {
    public static Crear elRegistro() {
        return Tasks.instrumented(Crear.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Llenar.elFormulario());
    }
}
