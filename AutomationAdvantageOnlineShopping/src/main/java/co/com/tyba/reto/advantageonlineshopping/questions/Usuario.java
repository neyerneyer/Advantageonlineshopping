package co.com.tyba.reto.advantageonlineshopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.RegisterUser.QUESTION_REGISTER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Usuario implements Question <String> {
    public static Usuario seRegistro() {
        return new Usuario();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(QUESTION_REGISTER,isVisible()).forNoMoreThan(60).seconds());
        return Text.of(QUESTION_REGISTER).answeredBy(actor);
    }
}