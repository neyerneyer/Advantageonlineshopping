package co.com.tyba.reto.advantageonlineshopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.RegisterUser.QUESTION_REGISTER;

public class Inicio implements Question<Boolean> {
    public static Inicio sesion() {
        return  new Inicio();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.recall("userLogin").equals(Text.of(QUESTION_REGISTER).answeredBy(actor));
    }
}
