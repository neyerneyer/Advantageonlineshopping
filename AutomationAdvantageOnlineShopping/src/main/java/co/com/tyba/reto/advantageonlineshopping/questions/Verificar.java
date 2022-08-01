package co.com.tyba.reto.advantageonlineshopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.ContactUs.QUESTION_CONTACT;

public class Verificar implements Question<Boolean> {
    String data;

    public Verificar(String data) {
        this.data = data;
    }

    public static Verificar informacionCon(String data) {
        return new Verificar(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return data.equals(Text.of(QUESTION_CONTACT).answeredBy(actor));
    }
}
