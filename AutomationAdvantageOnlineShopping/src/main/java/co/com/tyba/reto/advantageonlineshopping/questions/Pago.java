package co.com.tyba.reto.advantageonlineshopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tyba.reto.advantageonlineshopping.userinterfaces.Cart.QUESTIONS_PAY;

public class Pago implements Question<String> {
    public static Pago elProducto() {
        return new Pago();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(QUESTIONS_PAY).answeredBy(actor);
    }
}
