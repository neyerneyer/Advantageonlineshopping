package co.com.tyba.reto.advantageonlineshopping.tasks;

import co.com.tyba.reto.advantageonlineshopping.interactions.Diligenciar;
import co.com.tyba.reto.advantageonlineshopping.models.ModeloContacto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.ContactUs.TEXT_CONTACT_US;

public class Ingresar implements Task {
    ModeloContacto modelContacts;

    public Ingresar(ModeloContacto modelContacts) {
        this.modelContacts = modelContacts;
    }

    public static Ingresar informacionDe(ModeloContacto modelContacts) {
        return Tasks.instrumented(Ingresar.class, modelContacts);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TEXT_CONTACT_US),
                Diligenciar.informacion(modelContacts));
    }
}