package co.com.tyba.reto.advantageonlineshopping.interactions;

import co.com.tyba.reto.advantageonlineshopping.models.ModeloContacto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.ContactUs.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Diligenciar implements Interaction {
    ModeloContacto modelContacts;

    public Diligenciar(ModeloContacto modelContacts) {
        this.modelContacts = modelContacts;
    }

    public static Diligenciar informacion(ModeloContacto modelContacts) {
        return Tasks.instrumented(Diligenciar.class, modelContacts);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TYPE_CATEGORY, isVisible()),
                SelectFromOptions.byVisibleText(modelContacts.getCategory()).from(TYPE_CATEGORY),
                SelectFromOptions.byVisibleText(modelContacts.getProduct()).from(PRODUCT_LIST),
                Enter.theValue(modelContacts.getEmail()).into(EMAIL_CONTACT),
                Type.theValue(modelContacts.getSubject()).into(SUBJECT),
                Click.on(SEND)
        );
    }
}