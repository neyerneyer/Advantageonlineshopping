package co.com.tyba.reto.advantageonlineshopping.tasks;

import co.com.tyba.reto.advantageonlineshopping.models.ModeloSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.LoginUser.*;
import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.RegisterUser.MENU_USER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class IniciarSesion implements Task {
    ModeloSesion modelLogins;

    public IniciarSesion(ModeloSesion modelLogins) {
        this.modelLogins = modelLogins;
    }

    public static IniciarSesion con(ModeloSesion modelLogins) {
        return Tasks.instrumented(IniciarSesion.class,modelLogins);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MENU_USER,isEnabled()).forNoMoreThan(60).seconds(),
                Click.on(MENU_USER),
                WaitUntil.the(POP_UP,isVisible()).forNoMoreThan(2).seconds(),
                Type.theValue(modelLogins.getUser()).into(LOGIN_USERNAME),
                Type.theValue(modelLogins.getPass()).into(LOGIN_PASSWORD),
                Click.on(REMEMBER_ME),
                WaitUntil.the(SIGN_IN,isEnabled()).forNoMoreThan(60).seconds(),
                Click.on(SIGN_IN)
        );
        actor.remember("userLogin",modelLogins.getUser());
    }
}
